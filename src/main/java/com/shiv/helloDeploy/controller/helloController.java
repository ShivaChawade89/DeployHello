package com.shiv.helloDeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("get")
    public String hello(){
        return "hello User shiv";
    }
}
