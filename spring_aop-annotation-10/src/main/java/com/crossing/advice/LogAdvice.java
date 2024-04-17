package com.crossing.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @program: SSM_spring
 * @description: 增强类的内部
 * @author: ChenPei
 * @create: 2024-03-31 11:47
 **/

@Component
@Aspect
public class LogAdvice {

    @Pointcut("execution(* com.crossing.service.impl.*.*(..))")
    public void pc() {
    }

    ;

    //    @Before("execution(* com.crossing.service.impl.*.*(..))")
    @Before("pc()")
    public void start() {
        System.out.println("method start");
    }

    @After("execution(* com.crossing.service.impl.*.*(..))")
    public void after() {
        System.out.println("method end");
    }

    @AfterThrowing("execution(* com.crossing.service.impl.*.*(..))")
    public void error() {
        System.out.println("method error");
    }
}
