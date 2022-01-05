package com.haozai.plasma.cms.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haozai.plasma.cms.mapper.SysPostMapper;
import java.util.List;
import com.haozai.plasma.cms.entity.SysPost;
import com.haozai.plasma.cms.service.SysPostService;
@Service
public class SysPostServiceImpl implements SysPostService{

    @Resource
    private SysPostMapper sysPostMapper;

    @Override
    public int updateBatch(List<SysPost> list) {
        return sysPostMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysPost> list) {
        return sysPostMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysPost> list) {
        return sysPostMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(SysPost record) {
        return sysPostMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SysPost record) {
        return sysPostMapper.insertOrUpdateSelective(record);
    }

}
