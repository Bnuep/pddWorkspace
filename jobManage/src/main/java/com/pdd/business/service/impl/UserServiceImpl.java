package com.pdd.business.service.impl;

import com.pdd.business.dao.UserMapper;
import com.pdd.business.entity.User;
import com.pdd.business.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liugd on 16/1/18.
 */
@Service("userService")
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getUserAll();
    }
}
