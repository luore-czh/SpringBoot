package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController是这两个@Controller、@ResponseBody的合体
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, Spring Boot 2 !";
    }
}
