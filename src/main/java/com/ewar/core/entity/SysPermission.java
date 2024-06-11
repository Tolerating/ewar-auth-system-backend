package com.ewar.core.entity;

import java.util.Date;
import lombok.Data;

import java.io.Serializable;

/**
 * (SysPermission)表实体类
 *
 * @author makejava
 * @since 2024-06-11 23:54:01
 */
@Data
@SuppressWarnings("serial")
public class SysPermission {
//权限id
    private String id;
//权限名称
    private String label;
//父权限id
    private String parentId;
//授权标识符
    private String code;
//路由地址
    private String path;
//路由名称
    private String name;
//授权路径
    private String url;
//授权类型（0-目录 1-菜单 2-按钮）
    private Integer type;
//图标
    private String icon;
//创建时间
    private Date createTime;
//更新时间
    private Date updateTime;
//备注
    private String remark;
//排序
    private Integer sortCode;
//删除标志（1删除，0没有）
    private Integer deleteFlag;

}

