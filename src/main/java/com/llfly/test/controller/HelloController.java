package com.llfly.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangyou on 2018/1/14.
 */

@RestController
public class HelloController {

    @RequestMapping("/test")
    public String test(){
        return "hello,world";
    }
}
