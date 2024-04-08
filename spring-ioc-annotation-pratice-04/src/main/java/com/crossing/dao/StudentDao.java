package com.crossing.dao;

import com.crossing.pojo.Student;

import java.util.List;

/**
 * @program: SSM_spring
 * @description: 学员的持久层访问接口
 * @author: ChenPei
 * @create: 2024-03-20 16:29
 **/

public interface StudentDao {
    List<Student> quaryAll();
}
