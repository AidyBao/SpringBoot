package com.aidybao.controller;



import com.aidybao.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.EventListener;

//用springboot服务器创建https://start.spring.io工程

//Rest模式MVC控制器
@RestController
//请求映射名，通用访问前缀
@RequestMapping("/books")
public class BookController {

    //如何读取yml文件中的值
    @Value("${county}")
    private String country1;


    //如何读取yml文件中的值
    @Value("${user.name}")
    private String name1;

    //如何读取yml文件中字典的值
    @Value("${user.age}")
    private String age1;

    //如何读取yml文件中数组的值
    @Value("${likes[1]}")
    private String likes1;

    //如何读取yml文件中数组的值
    @Value("${tempDir}")
    private String tempDir;

    //使用自动装配将所有数据封装到一个对象中
    @Autowired
    private Environment env;

    //使用自动装配将所有数据封装到一个对象中
    @Autowired
    private MyDataSource myDataSource;

    //get请求
    @GetMapping
    public String getById() {
        System.out.println("springboot is running11");
        System.out.println("country1==>" + country1);
        System.out.println("name1==>" + name1);
        System.out.println("age1==>" + age1);
        System.out.println("likes1==>" + likes1);
        System.out.println("tempDir==>" + tempDir);
        System.out.println("==================");
        System.out.println("name==>" + env.getProperty("user.name"));
        System.out.println("port==>" + env.getProperty("server.port"));
        System.out.println("==================");
        System.out.println(myDataSource.toString());
        return "springboot is running";
    }

}
