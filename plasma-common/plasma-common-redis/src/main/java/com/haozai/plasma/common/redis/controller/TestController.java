package com.haozai.plasma.common.redis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common/redis")
public class TestController {

    //仅支持字符串的数据
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    //支持对象的数据，但需要对对象进行序列化
    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping("getInfo")
    public String getInfo(){
        //stringRedisTemplate.opsForValue().set("1",user.toString());
        redisTemplate.opsForValue().set("user","hello user");
        //        return stringRedisTemplate.opsForValue().get("1");
        return redisTemplate.opsForValue().get("user").toString();
    }

}
