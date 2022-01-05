package com.haozai.plasma.cms.service;

import java.util.List;
import com.haozai.plasma.cms.entity.SysUserRole;
public interface SysUserRoleService{


    int updateBatch(List<SysUserRole> list);

    int updateBatchSelective(List<SysUserRole> list);

    int batchInsert(List<SysUserRole> list);

    int insertOrUpdate(SysUserRole record);

    int insertOrUpdateSelective(SysUserRole record);

}
