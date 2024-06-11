package com.ewar.core.entity;

import java.util.Date;
import lombok.Data;

import java.io.Serializable;

/**
 * (SysDepartment)表实体类
 *
 * @author makejava
 * @since 2024-06-11 23:46:25
 */
@Data
@SuppressWarnings("serial")
public class SysDepartment{
//部门id
    private String id;
//上级部门id
    private String parentId;
//部门编号
    private String departmentCode;
//部门名称
    private String departmentName;
//部门地址
    private String departmentAddress;
//说明
    private String remark;
//排序
    private Integer sortCode;
//有效标志（1有效，0无效）
    private Integer enableMark;
//创建时间
    private Date createTime;
//创建用户
    private String createUser;
//修改时间
    private Date updateTime;
//修改用户
    private String updateUser;
//删除标志
    private Integer deleteFlag;
//删除时间
    private Date deleteTime;
//删除用户
    private String deleteUse;

}

