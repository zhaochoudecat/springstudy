package com.example.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by zhaochoudecat on 2021/7/11
 */
public class People {

    @Resource
    private Dog dog;

    @Resource(name="cat1")
    private Cat cat;
    private String name;

    public Dog getDog() {
        return dog;
    }
    public Cat getCat() {
        return cat;
    }
    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
