package com.crossing.ioc_04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-20 15:59
 **/
@Component
public class JavaBean {


    private String name = "Crossing";

    @Value("19")
    private int age;

    @Value("${jdbc.username")
    private String username;

    @Value("${jdbc.password")
    private String password;
}
