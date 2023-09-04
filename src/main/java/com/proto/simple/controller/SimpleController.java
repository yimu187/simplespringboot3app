package com.proto.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class SimpleController {

    @Autowired
    Environment env;

    @GetMapping(value = "/hello")
    public String welcomeMessage(){
        String messageFromJvmParm = env.getProperty("welcome.message");
        return messageFromJvmParm != null ? messageFromJvmParm : "Welcome Message";
    }
}
