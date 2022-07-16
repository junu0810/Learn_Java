package com.example.demo.controller;

import java.util.Map;

import com.example.demo.dto.UserRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    
    @GetMapping(path = "/hello") // http://localhost:8000/api/get/hello
    public String GetHello(){
        return "get Hello";
    }

    @RequestMapping(path ="/hi", method = RequestMethod.GET) //// http://localhost:8000/api/get/hello GET
    public String hi(){
        return "hi";
    }

    @GetMapping("/path-variable/{name}") //http://localhost:8000/api/get/path-variable/{naem}
    //대괄호에 들어가는 변수와 함수에 쓰이는 변수는 매칭되어야한다.
    public String pathVariable(@PathVariable(name = "name") String Pahtname){
        System.out.println("PahtVariable = " + Pahtname);
        return Pahtname;
    }

    //http://localhost:8000/api/get/query?name=baek&age=27&email=test@naver.com
    @GetMapping(path = "/query") 
    public String Getquery01(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(el -> {
            System.out.println(el.getKey());
            System.out.println(el.getValue());
            sb.append(el.getKey() + " = " + el.getValue()+"\n");
            System.out.println("\n");
        });
        return sb.toString(); 
    }

    ////http://localhost:8000/api/get/query02?name=baek&age=27&email=test@naver.com
    @GetMapping("/query02") 
    public String Getquery02(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age
        ){
            System.out.println(name);
            System.out.println(email);
            System.out.println(age);
            return name + " " + email + " " + age;
    }
    
    //http://localhost:8000/api/get/query03?name=baek&age=27&email=test@naver.com
    @GetMapping("/query03")
    public String Getquery03(UserRequest userRequest){

            System.out.println(userRequest.getName());
            System.out.println(userRequest.getEmail());
            System.out.println(userRequest.getAge());

            return userRequest.toString();
    }

}
