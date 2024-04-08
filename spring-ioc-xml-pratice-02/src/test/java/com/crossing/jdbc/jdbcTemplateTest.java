package com.crossing.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.crossing.controller.StudentController;
import com.crossing.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class jdbcTemplateTest {
    public void testForJava() {
        //连接池
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql:///studb");
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");


        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.setDataSource(druidDataSource);

        //jdbcTemplate.update() 非查询语句
        //jdbcTemplate.queryForObject(); 查询单个对象
        //jdbcTemplate.query(); 查询集合
    }

    /*
     * 通过IoC容器读取配置的JdbcTemplate组件
     * */
    @Test
    public void testForIoC() {
        //1.创建IoC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_01.xml");
        //2.获取JdbcTemplate组件
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        //3.进行数据库crud动作
        //3.1插入删除
        String sql = "insert into students (id,name,gender,age,class) values (?,?,?,?,?)";

        int rows = jdbcTemplate.update(sql, 9, "ChenPei", "男", 18, "2022级研究生");
        System.out.println("rows: " + rows);

        //3.2查询
        sql = "select * from students where id = ? ;";

        Student student1 = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            student.setGender(rs.getString("gender"));
            student.setClasses(rs.getString("class"));

            return student;
        }, 1);
        System.out.println("student1 = " + student1);
        //3.3查询所有
        sql = "select id, name, gender,age,class as classes from students;";
        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println("studentList = " + studentList);
    }

    /*
     * 从ioc容器中获取controller并且调用业务! 内部都是ioc容器进行组装
     * */
    @Test
    public void testQueryAll() {
        //1.创建ioc容器
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_02.xml");
        //2.获取组件对象
        StudentController studentController = applicationContext.getBean(StudentController.class);
        //3.使用组件对象
        studentController.findAll();
        //4.关闭容器
        applicationContext.close();
    }

}
