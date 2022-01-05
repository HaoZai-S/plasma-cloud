package com.haozai.plasma.cms.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.haozai.plasma.cms.entity.SysUser;
import com.haozai.plasma.cms.mapper.SysUserMapper;
import com.haozai.plasma.cms.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public int updateBatch(List<SysUser> list) {
        return sysUserMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysUser> list) {
        return sysUserMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysUser> list) {
        return sysUserMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(SysUser record) {
        return sysUserMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SysUser record) {
        return sysUserMapper.insertOrUpdateSelective(record);
    }

}

