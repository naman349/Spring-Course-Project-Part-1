package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.FuelTypeDAO;
import com.upgrad.hirewheels.services.FuelTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuelTypeServiceImpl implements FuelTypeService {

    @Autowired
    private FuelTypeDAO fuelTypeDAO;
}