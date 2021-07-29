package com.example.demo02;

/**
 * Created by zhaochoudecat on 2021/7/27
 */
public class Test {
    public static void main(String[] args){
        UserServiceImpl user = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(user);
        proxy.add();

    }
}
