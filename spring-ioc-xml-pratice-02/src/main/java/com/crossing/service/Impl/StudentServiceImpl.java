package com.crossing.service.Impl;

import com.crossing.dao.StudentDao;
import com.crossing.pojo.Student;
import com.crossing.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = studentDao.queryAll();
        System.out.println("studentService: " + students);
        return students;
    }
}
