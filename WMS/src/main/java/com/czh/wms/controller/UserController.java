package com.czh.wms.controller;

import com.czh.wms.entity.User;

import com.czh.wms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public List<User> showuser() {
        // return userService.list(); //使用Mybatis-Plus
        // 使用Mybatis
        return userService.listAll();
    }

    /**
     * 搭建项目测试
     * @return
     */
    @GetMapping("/home")
    public String showHome() {
        return "你好！";
    }
}
