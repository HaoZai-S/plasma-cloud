package com.haozai.plasma.cms.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.haozai.plasma.cms.entity.SysDept;
import com.haozai.plasma.cms.mapper.SysDeptMapper;
import com.haozai.plasma.cms.service.SysDeptService;

@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    @Override
    public int updateBatch(List<SysDept> list) {
        return sysDeptMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysDept> list) {
        return sysDeptMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysDept> list) {
        return sysDeptMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(SysDept record) {
        return sysDeptMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SysDept record) {
        return sysDeptMapper.insertOrUpdateSelective(record);
    }

}


