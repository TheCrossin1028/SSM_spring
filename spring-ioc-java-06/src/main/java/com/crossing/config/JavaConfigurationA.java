package com.crossing.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-21 19:52
 **/
@Import(value = JavaConfigurationB.class)
@Configuration
public class JavaConfigurationA {
}
