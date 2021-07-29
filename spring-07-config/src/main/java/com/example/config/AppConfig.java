package com.example.config;

import com.example.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by zhaochoudecat on 2021/7/13
 */
@Configuration
@ComponentScan("com.example.pojo")
@Import(MyConfig2.class)
public class AppConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
