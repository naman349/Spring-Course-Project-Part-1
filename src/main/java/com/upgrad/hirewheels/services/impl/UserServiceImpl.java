package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.UserDAO;
import com.upgrad.hirewheels.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
}