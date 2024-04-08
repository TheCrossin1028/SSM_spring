package com.crossing.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @program: SSM_spring
 * @description: Java类配置，替代xml文件
 * 1.包扫描配置
 * 2.注解配置
 * 3.引用外部配置文件
 * 4.声明第三方依赖的bean组件
 * 步骤1： 添加 @Configuration 代表我们是配置类
 * 步骤2： 实现上面的三个功能注解
 * @author: ChenPei
 * @create: 2024-03-20 17:28
 **/

@ComponentScan(value = "com.crossing.ioc_01")
@PropertySource(value = "classpath:jdbc.properties")
@Configuration
public class JavaConfiguration {

    @Value("${crossing.url}")
    private String url;

    @Value("${crossing.driver}")
    private String driver;

    @Value("${crossing.username}")
    private String username;

    @Value("${crossing.password}")
    private String password;

    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean(name = "ergouzi")
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public JdbcTemplate jdbcTemplate1(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
