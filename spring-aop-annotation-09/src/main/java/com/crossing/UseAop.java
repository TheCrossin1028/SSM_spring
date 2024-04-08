package com.crossing;

import com.crossing.statics.StaticProxyCalculator;

/**
 * @program: SSM_spring
 * @description:
 * @author: ChenPei
 * @create: 2024-03-24 17:56
 **/

public class UseAop {
    public static void main(String[] args) {
        Calculator target = new CalculatorPureImpl();

        Calculator proxy = new StaticProxyCalculator(target);

        int add = proxy.add(1, 5);
    }
}
