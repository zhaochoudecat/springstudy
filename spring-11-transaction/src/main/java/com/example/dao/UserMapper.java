package com.example.dao;

import com.example.pojo.User;

import java.util.List;

/**
 * Created by zhaochoudecat on 2021/8/4
 */
public interface UserMapper {
    List<User> selectUser();

    //添加一个用户
    int addUser(User user);

    //根据id删除用户
    int deleteUser(int id);
}
