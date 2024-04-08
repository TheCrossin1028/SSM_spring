package com.crossing.ioc;

import com.crossing.Controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SSM_spring
 * @description: Test
 * @author: ChenPei
 * @create: 2024-03-20 16:47
 **/

public class SpringIocTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_01.xml");
        StudentController controller = applicationContext.getBean(StudentController.class);
        controller.findAll();
    }
}
