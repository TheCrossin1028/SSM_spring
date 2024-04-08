package com.crossing.test;

import com.crossing.ioc_03.HappyComponent;
import com.crossing.ioc_04.JavaBean2;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCTest {

    public void createIoC() {
        //创建容器 选择合适的容器
        //方式1: 直接创建容器并且指定配置文件即可 [推荐]
        // 构造函数(String...配置文件) 可以填写一个或者多个
        // ioc di
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_03.xml");

    }

    @Test
    public void getBeanFromIoC() {
        //1.创建IoC容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocations("spring_03.xml");
        applicationContext.refresh();
        //2.读取IoC容器组件
        //方案1: 直接根据beanId获取即可  返回值类型是Object 需要强转 [不推荐]
        HappyComponent happyComponent = (HappyComponent) applicationContext.getBean("happyComponent");
        //方案2: 根据beanId,同时指定bean的类型 Class
        applicationContext.getBean("happyComponent", HappyComponent.class);
        //方案3: 直接根据类型获取
        //TODO: 根据bean的类型获取,同一个类型,在ioc容器中只能有一个bean!!!
        //TODO: 如果ioc容器存在多个同类型的Bean 会出现: NoUniqueBeanDefinitionException
        //TODO: ioc的配置一定是实现类,但是可以根据接口类型获取值!   getBean(类型);  instanceof
        HappyComponent happyComponent1 = applicationContext.getBean(HappyComponent.class);

        happyComponent1.doWork();

    }

    @Test
    public void test_04() {
        //1.创建Ioc容器 调用init
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_04.xml");

        JavaBean2 bean = applicationContext.getBean(JavaBean2.class);
        JavaBean2 bean1 = applicationContext.getBean(JavaBean2.class);
        System.out.println(bean == bean1);

        //2.正常结束ioc容器 调用clear
        applicationContext.close();
    }
}
