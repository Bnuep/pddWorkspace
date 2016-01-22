package com.pdd.business.service;

import com.pdd.business.entity.User;

import java.util.List;

/**
 * Created by liugd on 16/1/18.
 */
public interface IUserService {
    public User getUserByName(String name);
    public List<User> getAllUser();
}
