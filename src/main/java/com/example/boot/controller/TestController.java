package com.example.boot.controller;

import com.example.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String testIt() {
        return "你好，快去睡觉吧！";
    }

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person() {
        return person;
    }
}
