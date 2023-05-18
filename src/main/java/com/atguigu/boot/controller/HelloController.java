package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController是这两个@Controller、@ResponseBody的合体
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, 小陈 !";
    }

    @Autowired
    Car car;
    @RequestMapping("/car")
    public Car car() {
        return car;
    }
}
