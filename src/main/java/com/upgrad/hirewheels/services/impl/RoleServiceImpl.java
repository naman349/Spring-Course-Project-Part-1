package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.RoleDAO;
import com.upgrad.hirewheels.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDAO roleDAO;
}