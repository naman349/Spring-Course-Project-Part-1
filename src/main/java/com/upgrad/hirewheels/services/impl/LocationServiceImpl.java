package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.LocationDAO;
import com.upgrad.hirewheels.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationDAO locationDAO;
}