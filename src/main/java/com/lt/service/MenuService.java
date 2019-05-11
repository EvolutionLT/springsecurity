package com.lt.service;


import com.lt.bean.Menu;

import java.util.List;


public interface MenuService {

    List<Menu> getMenusByUserId(Integer userId);
}
