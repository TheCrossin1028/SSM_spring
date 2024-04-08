package com.crossing.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-31 11:35
 **/

@Configuration
@ComponentScan("com.crossing")
@EnableAspectJAutoProxy//开启aspectj的朱姐
public class JavaConfig {
}
