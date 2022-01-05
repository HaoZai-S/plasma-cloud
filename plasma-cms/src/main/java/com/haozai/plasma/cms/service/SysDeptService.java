package com.haozai.plasma.cms.service;

import java.util.List;
import com.haozai.plasma.cms.entity.SysDept;

public interface SysDeptService {


    int updateBatch(List<SysDept> list);

    int updateBatchSelective(List<SysDept> list);

    int batchInsert(List<SysDept> list);

    int insertOrUpdate(SysDept record);

    int insertOrUpdateSelective(SysDept record);

}


