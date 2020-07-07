package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.VehicleCategoryDAO;
import com.upgrad.hirewheels.services.VehicleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleCategoryServiceImpl implements VehicleCategoryService {

    @Autowired
    private VehicleCategoryDAO vehicleCategoryDAO;
}
