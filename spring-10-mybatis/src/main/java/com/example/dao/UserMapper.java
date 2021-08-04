package com.example.dao;

import com.example.pojo.User;

import java.util.List;

/**
 * Created by zhaochoudecat on 2021/8/4
 */
public interface UserMapper {
    List<User> selectUser();
}
