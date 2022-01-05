package com.haozai.plasma.cms.mapper;

import com.haozai.plasma.cms.entity.SysPost;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysPostMapper extends tk.mybatis.mapper.common.Mapper<SysPost> {
    int updateBatch(List<SysPost> list);

    int updateBatchSelective(List<SysPost> list);

    int batchInsert(@Param("list") List<SysPost> list);

    int insertOrUpdate(SysPost record);

    int insertOrUpdateSelective(SysPost record);
}