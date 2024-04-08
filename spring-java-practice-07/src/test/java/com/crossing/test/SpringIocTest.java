package com.crossing.test;

import com.crossing.Controller.StudentController;
import com.crossing.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-21 20:12
 **/

public class SpringIocTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController controller = applicationContext.getBean(StudentController.class);
        controller.findAll();
    }
}
