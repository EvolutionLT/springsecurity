package com.lt.service.impl;


import com.lt.bean.User;
import com.lt.mapper.UserMapper;
import com.lt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInfo(User user) {
        User userInfo = userMapper.getUserInfo(user);
        return userInfo;
    }

    @Override
    public User loadUserByUsername(String s) {
        return userMapper.loadUserByUsername(s);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
