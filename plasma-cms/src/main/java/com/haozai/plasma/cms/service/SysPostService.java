package com.haozai.plasma.cms.service;

import java.util.List;
import com.haozai.plasma.cms.entity.SysPost;
public interface SysPostService{


    int updateBatch(List<SysPost> list);

    int updateBatchSelective(List<SysPost> list);

    int batchInsert(List<SysPost> list);

    int insertOrUpdate(SysPost record);

    int insertOrUpdateSelective(SysPost record);

}
