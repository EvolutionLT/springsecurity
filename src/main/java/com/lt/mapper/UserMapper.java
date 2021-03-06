package com.lt.mapper;

import com.lt.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public User getUserInfo(User user);

    User loadUserByUsername(String s);

    List<User> getAllUsers();
}
