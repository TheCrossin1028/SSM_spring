package com.crossing.test;

import com.crossing.components.A;
import com.crossing.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-22 15:40
 **/

@SpringJUnitConfig(value = JavaConfig.class)
public class SpringIocTest {
    @Autowired
    private A a;

    @Test
    public void test() {
        //1.创建ioc容器

    }
}
