package com.haozai.plasma.cms.service;

import java.util.List;
import com.haozai.plasma.cms.entity.SysRole;
public interface SysRoleService{


    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(List<SysRole> list);

    int insertOrUpdate(SysRole record);

    int insertOrUpdateSelective(SysRole record);

}
