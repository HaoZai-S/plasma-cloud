package com.haozai.plasma.cms.entity;

import javax.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

/**
    * 用户和角色关联表
    */
@Data
@Table(name = "sys_user_role")
@Accessors(chain = true)
public class SysUserRole {
    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Long roleId;
}