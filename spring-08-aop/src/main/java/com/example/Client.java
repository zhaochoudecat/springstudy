package com.example;

/**
 * Created by zhaochoudecat on 2021/7/27
 */
//客户类 一般找代理
public class Client {
    public static void main(String[] args){
        //房东要租房
        Host host = new Host();
        //中介帮房东租出去
        Proxy proxy = new Proxy(host);
        //你去找中介
        proxy.rent();
    }
}
