package com.crossing.controller;

import com.crossing.pojo.Student;
import com.crossing.service.StudentService;

import java.util.List;

public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void findAll() {
        List<Student> students = studentService.findAll();
        System.out.println("StudentController: " + students);
    }
}
