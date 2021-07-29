package com.example;

/**
 * Created by zhaochoudecat on 2021/7/27
 */

/**
 * 中介 代理
 */
public class Proxy implements Rent{

    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }

    public void seeHouse(){
        System.out.println("看房子");
    }

    public void fare(){
        System.out.println("租赁合同");
    }
}
