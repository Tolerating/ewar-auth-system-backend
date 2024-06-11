package com.ewar.core.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (SysUserRole)表实体类
 *
 * @author makejava
 * @since 2024-06-11 23:54:56
 */
@Data
@SuppressWarnings("serial")
public class SysUserRole {
//自然主键
    private Long id;
//用户id
    private String userId;
//角色id
    private String roleId;
}

