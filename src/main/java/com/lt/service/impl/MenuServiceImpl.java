package com.lt.service.impl;


import com.lt.bean.Menu;
import com.lt.mapper.MenuMapper;
import com.lt.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<Menu> getMenusByUserId(Integer userId) {
        return menuMapper.getMenusByUserId(userId);
    }
}
