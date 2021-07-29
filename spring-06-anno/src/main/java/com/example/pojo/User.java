package com.example.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by zhaochoudecat on 2021/7/13
 */

@Scope("singleton")
//@Component 相当于 <bean id="user" class="com.example.pojo.User"/>
@Component("user")
public class User {

    //@Value 相当于 <property name="name" value="lk"/>
    @Value("lk1")
    public String name;

}
