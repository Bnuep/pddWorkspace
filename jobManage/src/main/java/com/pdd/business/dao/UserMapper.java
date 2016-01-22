package com.pdd.business.dao;

import com.pdd.business.entity.User;

import java.util.List;

/**
 * Created by liugd on 16/1/18.
 */
public interface UserMapper {
    User getUserByName(String name);

    List<User> getUserAll();
}
