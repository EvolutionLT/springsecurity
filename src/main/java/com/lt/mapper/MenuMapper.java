package com.lt.mapper;


import com.lt.bean.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getMenusByUserId(Integer userId);
}
