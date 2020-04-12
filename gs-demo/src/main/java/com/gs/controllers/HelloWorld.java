package com.gs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//apiDemo Restful风格

@RestController
@RequestMapping("demo")//根路径
public class HelloWorld {

    @GetMapping("test")//子路径
    public String test() {
        return "Hello World!";
    }

}
