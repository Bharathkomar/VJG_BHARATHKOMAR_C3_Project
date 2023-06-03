package com.upgrad.helloworld.springboothelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String random(){
        return "Hello and welcome to your first web project using Spring Boot";
    }
}
