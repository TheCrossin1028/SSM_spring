package com.crossing.ioc_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-20 17:24
 **/
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
}
