package com.crossing.Controller;

import com.crossing.pojo.Student;
import com.crossing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-20 16:39
 **/
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    public void findAll() {
        List<Student> all = studentService.findAll();
        System.out.println("all = " + all);
    }

}
