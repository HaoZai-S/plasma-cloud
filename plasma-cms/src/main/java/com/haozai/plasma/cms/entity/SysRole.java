package com.haozai.plasma.cms.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
    * 角色信息表
    */
@Data
@Table(name = "sys_role")
public class SysRole {
    /**
     * 角色ID
     */
    @Id
    @Column(name = "role_id")
    @GeneratedValue(generator = "JDBC")
    private Long roleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色权限字符串
     */
    @Column(name = "role_key")
    private String roleKey;

    /**
     * 显示顺序
     */
    @Column(name = "role_sort")
    private Integer roleSort;

    /**
     * 数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）
     */
    @Column(name = "data_scope")
    private String dataScope;

    /**
     * 菜单树选择项是否关联显示
     */
    @Column(name = "menu_check_strictly")
    private Boolean menuCheckStrictly;

    /**
     * 部门树选择项是否关联显示
     */
    @Column(name = "dept_check_strictly")
    private Boolean deptCheckStrictly;

    /**
     * 角色状态（0正常 1停用）
     */
    @Column(name = "`status`")
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;
}