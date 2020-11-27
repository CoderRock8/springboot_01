package com.atguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@ResponseBody
//@org.springframework.stereotype.Controller
@RestController
public class Controller {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
