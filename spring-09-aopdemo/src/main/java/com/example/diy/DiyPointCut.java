package com.example.diy;

/**
 * Created by zhaochoudecat on 2021/7/31
 */
public class DiyPointCut {
    public void before(){
        System.out.println("===执行前===");
    }
    public void after(){
        System.out.println("======执行后====");
    }
}