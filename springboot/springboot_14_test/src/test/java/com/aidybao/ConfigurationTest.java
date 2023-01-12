package com.aidybao;

import com.aidybao.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
//@Import导入MsgConfig配置
@Import(MsgConfig.class)
public class ConfigurationTest {

    //@Autowired自动装配
    @Autowired
    private String msg;

    //@Test添加测试
    @Test
    void testConfiguration() {
        System.out.println(msg);
    }
}
