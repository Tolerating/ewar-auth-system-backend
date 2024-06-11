package com.ewar.core.controller;

import com.ewar.core.common.utils.Result;
import com.ewar.core.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("/list")
    public Result listAll(){
        return Result.ok(sysUserService.list());
    }
}
