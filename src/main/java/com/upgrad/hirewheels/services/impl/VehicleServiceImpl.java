package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.VehicleDAO;
import com.upgrad.hirewheels.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDAO vehicleDAO;
}