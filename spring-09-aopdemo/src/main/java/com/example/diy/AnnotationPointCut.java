package com.example.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by zhaochoudecat on 2021/8/4
 */

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.example.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("==方法执行前==");
    }
    
    @After("execution(* com.example.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("==方法执行后==");
    }

    @Around("execution(* com.example.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("环绕前");
        System.out.println(pj.getSignature());
        //执行目标方法
        Object ob = pj.proceed();
        System.out.println("环绕后");
        System.out.println(ob);
    }
}
