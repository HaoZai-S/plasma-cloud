package com.haozai.plasma.cms.mapper;

import com.haozai.plasma.cms.entity.SysDept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysDeptMapper extends tk.mybatis.mapper.common.Mapper<SysDept> {
    int updateBatch(List<SysDept> list);

    int updateBatchSelective(List<SysDept> list);

    int batchInsert(@Param("list") List<SysDept> list);

    int insertOrUpdate(SysDept record);

    int insertOrUpdateSelective(SysDept record);
}