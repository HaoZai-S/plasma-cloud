package com.haozai.plasma.cms.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.haozai.plasma.cms.entity.SysRole;
import com.haozai.plasma.cms.mapper.SysRoleMapper;
import com.haozai.plasma.cms.service.SysRoleService;
@Service
public class SysRoleServiceImpl implements SysRoleService{

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public int updateBatch(List<SysRole> list) {
        return sysRoleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysRole> list) {
        return sysRoleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysRole> list) {
        return sysRoleMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(SysRole record) {
        return sysRoleMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SysRole record) {
        return sysRoleMapper.insertOrUpdateSelective(record);
    }

}
