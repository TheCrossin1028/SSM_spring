package com.crossing.test;

import com.crossing.config.JavaConfiguration;
import com.crossing.config.JavaConfigurationA;
import com.crossing.config.JavaConfigurationB;
import com.crossing.ioc_01.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-20 17:42
 **/

public class SpringIocTest {
    @Test
    public void test() {

        //1.创建ioc容器
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        AnnotationConfigApplicationContext applicationContext1 = new AnnotationConfigApplicationContext();
        applicationContext1.register(JavaConfiguration.class);
        applicationContext1.refresh(); //ioc di
        //2.获取bean

        StudentController bean = applicationContext.getBean(StudentController.class);

        System.out.println("bean = " + bean);

    }

    @Test
    public void test_04() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfigurationA.class, JavaConfigurationB.class);
    }
}
