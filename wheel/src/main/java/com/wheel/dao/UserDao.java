package com.wheel.dao;

import com.wheel.pojo.*;;

public interface UserDao {
    int insert(User record);

    int insertSelective(User record);
}