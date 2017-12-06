package com.cms.login.app.service;

import java.util.List;

import com.cms.login.app.model.User;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
}
