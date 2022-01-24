package com.haozai.plasma.common.redis.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Redis工具类
 * <p>
 * 声明: 此工具只简单包装了redisTemplate的大部分常用的api, 没有包装redisTemplate所有的api。
 * 如果对此工具类中的功能不太满意, 或对StringRedisTemplate提供的api不太满意，
 * 那么可自行实现相应的{@link StringRedisTemplate}类中的对应execute方法, 以达
 * 到自己想要的效果; 至于如何实现,则可参考源码或{@link RedisUtil.LockOps}中的方法。
 * <p>
 * 注: 此工具类依赖spring-boot-starter-data-redis类库、以及可选的lombok、fastjson
 * 注: 更多javadoc细节，可详见{@link RedisOperations}
 * <p>
 * 统一说明一: 方法中的key、 value都不能为null。
 * 统一说明二: 不能跨数据类型进行操作， 否者会操作失败/操作报错。
 * 如: 向一个String类型的做Hash操作，会失败/报错......等等
 *
 * @author haozai
 */
@Slf4j
@Component
@SuppressWarnings("unused")
public class RedisUtils2 implements ApplicationContextAware {
    /**
     * 使用StringRedisTemplate(，其是RedisTemplate的定制化升级)
     */
    private static StringRedisTemplate redisTemplate;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        RedisUtils2.redisTemplate = applicationContext.getBean(StringRedisTemplate.class);
    }


    /**
     * key相关操作
     *
     * @author haozai
     */
    public static class KeyOps {
        /**
         * 根据key, 删除redis中的对应key-value
         * <p>
         * 注: 若删除失败, 则返回false。
         * <p>
         * 若redis中，不存在该key, 那么返回的也是false。
         * 所以，不能因为返回了false,就认为redis中一定还存
         * 在该key对应的key-value。
         *
         * @param key 要删除的key
         * @return 删除是否成功
         * @date 2020/3/7 17:15:02
         */
        public static boolean delete(String key) {
            log.info("delete(...) => key -> {}", key);
            // 返回值只可能为true/false, 不可能为null
            Boolean result = redisTemplate.delete(key);
            log.info("delete(...) => result -> {}", result);
            if (result == null) {
                throw new RedisOpsResultIsNullException();
            }
            return result;
        }
    }


    /**
     * 当使用Pipeline 或 Transaction操作redis时, (不论redis中实际操作是否成功, 这里)结果(都)会返回null。
     * 此时，如果试着将null转换为基本类型的数据时，会抛出此异常。
     * <p>
     * 即: 此工具类中的某些方法, 希望不要使用Pipeline或Transaction操作redis。
     * <p>
     * 注: Pipeline 或 Transaction默认是不启用的， 可详见源码:
     *
     * @author JustryDeng
     * @date 2020/3/14 21:22:39
     * @see LettuceConnection#isPipelined()
     * @see LettuceConnection#isQueueing()
     * @see JedisConnection#isPipelined()
     * @see JedisConnection#isQueueing()
     */
    public static class RedisOpsResultIsNullException extends NullPointerException {

        public RedisOpsResultIsNullException() {
            super();
        }

        public RedisOpsResultIsNullException(String message) {
            super(message);
        }
    }

    /**
     * 提供一些基础功能支持
     *
     * @author JustryDeng
     * @date 2020/3/16 0:48:14
     */
    public static class Helper {

        /**
         * 默认拼接符
         */
        public static final String DEFAULT_SYMBOL = ":";

        /**
         * 拼接args
         *
         * @see Helper#joinBySymbol(String, String...)
         */
        public static String join(String... args) {
            return Helper.joinBySymbol(DEFAULT_SYMBOL, args);
        }

        /**
         * 使用symbol拼接args
         *
         * @param symbol 分隔符， 如: 【:】
         * @param args   要拼接的元素数组, 如: 【a b c】
         * @return 拼接后的字符串, 如  【a:b:c】
         * @date 2019/9/8 16:11
         */
        public static String joinBySymbol(String symbol, String... args) {
            if (symbol == null || symbol.trim().length() == 0) {
                throw new RuntimeException(" symbol must not be empty!");
            }
            if (args == null || args.length == 0) {
                throw new RuntimeException(" args must not be empty!");
            }
            StringBuilder sb = new StringBuilder(16);
            for (String arg : args) {
                sb.append(arg).append(symbol);
            }
            sb.replace(sb.length() - symbol.length(), sb.length(), "");
            return sb.toString();
        }


    }
}
