package com.ewar.core.entity;

import java.util.Date;
import lombok.Data;

import java.io.Serializable;

/**
 * (SysUser)表实体类
 *
 * @author makejava
 * @since 2024-06-11 23:54:43
 */
@Data
@SuppressWarnings("serial")
public class SysUser{
//用户id
    private String id;
//用户账号
    private String account;
//登录密码
    private String password;
//账户是否过期（1过期，0没有）
    private Integer hasAccountExpired;
//账号是否锁定（1锁，0无）
    private Integer hasAccountLocked;
//账号是否可用
    private Integer hasEnabel;
//昵称
    private String nickName;
//真实姓名
    private String realName;
//所属部门id
    private String departmentId;
//性别（1男，0女）
    private Integer gender;
//电话
    private String phone;
//邮箱
    private String email;
//头像
    private String avatar;
//是否管理员（1是，0否）
    private Integer hasAdmin;
//创建时间
    private Date createTime;
//创建用户
    private String createUser;
//更新时间
    private Date updateTime;
//更新用户
    private String updateUser;
//删除标志（1删除，0未删除）
    private Integer deleteFlag;
//删除时间
    private Date deleteTime;
//删除用户
    private String deleteUser;
}

