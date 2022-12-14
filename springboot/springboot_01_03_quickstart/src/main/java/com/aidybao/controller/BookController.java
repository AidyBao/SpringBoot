package com.aidybao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//用阿里云服务器创建http://start.aliyun.com

//Rest模式MVC控制器
@RestController
//请求映射名，通用访问前缀
@RequestMapping("/books")
public class BookController {

    //get请求
    @GetMapping
    public String getById() {
        System.out.println("springboot is running...3");
        return "springboot is running...3";
    }

}
