package com.aidybao.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//用springboot服务器创建https://start.spring.io工程

//Rest模式MVC控制器
@RestController
//请求映射名，通用访问前缀
@RequestMapping("/books")
public class BookController {

    //get请求
    @GetMapping
    public String getById() {
        System.out.println("springboot is running");
        return "springboot is running";
    }

}
