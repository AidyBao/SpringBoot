package com.aidybao.controller;



import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

//用springboot服务器创建https://start.spring.io工程

//Rest模式MVC控制器
@RestController
//请求映射名，通用访问前缀
@RequestMapping("/books")
public class BookController extends BaseClass {

//    private static fifnal Logger log = Logger.getLogger(BookController.class.getName());

    //get请求
    @GetMapping
    public String getById() {
        System.out.println("springboot is running");

        log.debug("debug...");
        log.info("info...");
        log.warn("warning...");
        log.error("error...");

        return "springboot is running";
    }

}
