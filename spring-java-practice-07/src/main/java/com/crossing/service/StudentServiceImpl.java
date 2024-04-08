package com.crossing.service;

import com.crossing.dao.StudentDao;
import com.crossing.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-20 16:36
 **/

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDao.quaryAll();
        return studentList;
    }
}
