package com.crossing.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-04-12 10:20
 **/

@Component
public class MyPointCut {
    @Pointcut("execution(* com.crossing.service.impl.*.*(..))")
    public void pc() {
    }

}
