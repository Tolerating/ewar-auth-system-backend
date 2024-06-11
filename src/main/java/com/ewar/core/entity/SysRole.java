package com.ewar.core.entity;

import java.util.Date;
import lombok.Data;

import java.io.Serializable;

/**
 * (SysRole)表实体类
 *
 * @author makejava
 * @since 2024-06-11 23:54:16
 */
@Data
@SuppressWarnings("serial")
public class SysRole {
//角色id
    private String id;
//角色编号
    private String roleCode;
//角色名称
    private String roleName;
//创建时间
    private Date createTime;
//创建人
    private String createUser;
//更新时间
    private Date updateTime;
//备注
    private String remark;
//是否删除（1删除，0未删除）
    private Integer deleteFlag;
}

