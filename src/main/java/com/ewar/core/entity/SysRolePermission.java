package com.ewar.core.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (SysRolePermission)表实体类
 *
 * @author makejava
 * @since 2024-06-11 23:54:31
 */
@Data
@SuppressWarnings("serial")
public class SysRolePermission {
//自然主键
    private Long id;
//角色id
    private String roleId;
//权限id
    private String permissionId;
}

