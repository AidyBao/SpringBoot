package com.aidybao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

//1.properties属性可以为当前测试用例添加临时的属性配置
//@SpringBootTest(properties = {"test.prop=testValue1"})

//2.args属性可以为当前测试用例添加临时的属性配置
//@SpringBootTest(args = {"--test.prop=testValue2"})

//3.args优先级高于properties
@SpringBootTest(properties = {"test.prop=testValue1"},args = {"--test.prop=testValue2"})
public class PropertiesAndArgsTest {

    @Value("${test.prop}")
    private String msg;

    @Test
    void testProperties() {
        System.out.println(msg);
    }
}
