package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.CityDAO;
import com.upgrad.hirewheels.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDAO cityDAO;
}