package com.example.demo.controller;

import java.util.Map;

import com.example.demo.dto.PostRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {
    
    //http://localhost:8000/api/post
    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData){

        requestData.entrySet().forEach(el ->{
            System.out.println("key: " + el.getKey());
            System.out.println("value: " + el.getValue());
        });
    }

    //http://localhost:8000/api/post02
    @PostMapping("/post02")
    public void post02(@RequestBody PostRequest postRequest){

        System.out.println(postRequest.toString());
    }
}
