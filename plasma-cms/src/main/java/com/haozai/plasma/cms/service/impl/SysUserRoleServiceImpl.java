package com.haozai.plasma.cms.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.haozai.plasma.cms.mapper.SysUserRoleMapper;
import com.haozai.plasma.cms.entity.SysUserRole;
import com.haozai.plasma.cms.service.SysUserRoleService;
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService{

    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public int updateBatch(List<SysUserRole> list) {
        return sysUserRoleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysUserRole> list) {
        return sysUserRoleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysUserRole> list) {
        return sysUserRoleMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(SysUserRole record) {
        return sysUserRoleMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SysUserRole record) {
        return sysUserRoleMapper.insertOrUpdateSelective(record);
    }

}
