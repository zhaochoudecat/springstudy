package com.example.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zhaochoudecat on 2021/7/13
 */

@Component
public class User {
    @Value("123")
    public String name;
}
