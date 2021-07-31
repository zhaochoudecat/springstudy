package com.example.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by zhaochoudecat on 2021/7/31
 */
public class BeforeLog implements MethodBeforeAdvice {

    /**
     * @param method 要执行目标对象的方法
     * @param args   被调用的方法参数
     * @param target 目标对象
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        assert target != null;
        System.out.println(target.getClass().getName()+ "的"+method.getName() + "方法被执行了");
    }
}
