package com.example.demo04;

import com.example.demo02.UserService;
import com.example.demo02.UserServiceImpl;

/**
 * Created by zhaochoudecat on 2021/7/29
 */
public class Client {
    public static void main(String[] args){
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);

        //获取代理对象
        UserService service = (UserService) pih.getProxy();

        service.delete();
    }
}
