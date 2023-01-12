package com.aidybao.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Slf4j导入日志
@Slf4j
//Rest模式MVC控制器
@RestController
//请求映射名，通用访问前缀
@RequestMapping("/user-books")
public class TestLombokController {


    //get请求
    @GetMapping
    public String getById() {
        System.out.println("springboot is running");

        log.debug("debug...");
        log.info("info...");
        log.warn("warning...");
        log.error("error...");

        return "TestLombokController";
    }
}
