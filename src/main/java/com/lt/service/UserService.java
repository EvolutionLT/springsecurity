package com.lt.service;



import com.lt.bean.User;

import java.util.List;

public interface UserService  {
     User getUserInfo(User user);

     User loadUserByUsername(String s);

     List<User> getAllUsers();
}
