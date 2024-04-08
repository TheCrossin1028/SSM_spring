package com.crossing.ioc_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @program: SSM_spring
 * @description: user的表述层
 * @author: ChenPei
 * @create: 2024-03-20 15:25
 **/
@Controller
public class UserController {

    //自动装配注解
    @Autowired
    private UserService userService;

    public void show() {
        //调用业务层show方法
        String show = userService.show();
        System.out.println("show = " + show);
    }
}
