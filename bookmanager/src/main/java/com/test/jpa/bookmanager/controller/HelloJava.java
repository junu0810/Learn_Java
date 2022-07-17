package com.test.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJava {
    
    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "hello-world";
    }
}
