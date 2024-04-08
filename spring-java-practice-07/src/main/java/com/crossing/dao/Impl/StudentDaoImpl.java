package com.crossing.dao.Impl;

import com.crossing.dao.StudentDao;
import com.crossing.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: SSM_spring
 * @description: StudentDaoImpl JdbcTemplate
 * @author: ChenPei
 * @create: 2024-03-20 16:31
 **/
@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> quaryAll() {
        String sql = "select id , name , age , gender , class as classes from students ;";

        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        return studentList;
    }
}
