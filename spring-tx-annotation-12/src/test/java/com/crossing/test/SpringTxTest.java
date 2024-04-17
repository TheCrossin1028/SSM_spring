package com.crossing.test;

import com.crossing.config.JavaConfig;
import com.crossing.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-04-17 15:56
 **/

@SpringJUnitConfig(JavaConfig.class)
public class SpringTxTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void test() {
        studentService.changeInfo();
    }
}
