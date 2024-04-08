package com.crossing.ioc_03;

import org.springframework.stereotype.Service;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-20 15:27
 **/
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String show() {
        return "UserServiceImpl show()";
    }
}
