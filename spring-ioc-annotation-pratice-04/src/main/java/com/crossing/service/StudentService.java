package com.crossing.service;

import com.crossing.pojo.Student;

import java.util.List;

/**
 * @program: SSM_spring
 * @description: 学员的业务接口
 * @author: ChenPei
 * @create: 2024-03-20 16:34
 **/

public interface StudentService {
    List<Student> findAll();
}
