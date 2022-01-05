package com.haozai.plasma.cms.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
    * 岗位信息表
    */
@Data
@Table(name = "sys_post")
public class SysPost {
    /**
     * 岗位ID
     */
    @Id
    @Column(name = "post_id")
    @GeneratedValue(generator = "JDBC")
    private Long postId;

    /**
     * 岗位编码
     */
    @Column(name = "post_code")
    private String postCode;

    /**
     * 岗位名称
     */
    @Column(name = "post_name")
    private String postName;

    /**
     * 显示顺序
     */
    @Column(name = "post_sort")
    private Integer postSort;

    /**
     * 状态（0正常 1停用）
     */
    @Column(name = "`status`")
    private String status;

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