package com.crossing.text;

import com.crossing.config.JavaConfig;
import com.crossing.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-31 11:37
 **/
@SpringJUnitConfig(value = JavaConfig.class)
public class SpringAopTest {
    @Autowired
    private Calculator calculator;


    @Test
    public void test() {
        int add = calculator.add(1, 1);
        System.out.println("add = " + add);
    }
}
