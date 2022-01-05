package com.haozai.plasma.cms.service;

import java.util.List;
import com.haozai.plasma.cms.entity.SysUser;

public interface SysUserService {


    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(List<SysUser> list);

    int insertOrUpdate(SysUser record);

    int insertOrUpdateSelective(SysUser record);

}

