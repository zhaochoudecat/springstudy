package com.example.demo03;

import com.example.Host;
import com.example.Rent;

/**
 * Created by zhaochoudecat on 2021/7/29
 */
public class Client {
    public static void main(String[] args){
        //真实角色
        Host host = new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //将真实角色放进去  实现接口的类 = 接口
        pih.setRent(host);
        //获取代理角色
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
