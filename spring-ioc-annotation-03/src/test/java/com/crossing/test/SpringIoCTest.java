package com.crossing.test;

import com.crossing.ioc_01.XxxDao;
import com.crossing.ioc_02.JavaBean;
import com.crossing.ioc_03.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {
    @Test
    public void testIoc_01() {
        //1.创建ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_01.xml");
        //2.获取组件
        XxxDao bean = applicationContext.getBean(XxxDao.class);
        System.out.println("bean = " + bean);

        Object xxxService = applicationContext.getBean("xxxService");
        System.out.println("Service = " + xxxService);
        //3.close容器
        applicationContext.close();
    }

    @Test
    public void testIoc_02() {
        //1.创建ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_02.xml");
        //2.获取组件
        JavaBean bean = applicationContext.getBean(JavaBean.class);
        JavaBean bean1 = applicationContext.getBean(JavaBean.class);
        System.out.println(bean == bean1);
        //3.close容器
        applicationContext.close();
    }

    @Test
    public void testIoc_03() {
        //1.创建ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_03.xml");
        //2.获取组件
        UserController userController = applicationContext.getBean(UserController.class);

        //场景1: ioc容器中有一个UserService接口对应的实现类对象！
        userController.show();

        //场景2: ioc容器没有默认的类型如何处理
        // @Autowired 使用它进行装配，【 默认 】情况下至少要求有一个bean！ 否则报错！ 可以指定佛系装配

        //3.close容器
        applicationContext.close();
    }
}
