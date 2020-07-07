package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.VehicleSubCategoryDAO;
import com.upgrad.hirewheels.services.VehicleSubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleSubCategoryServiceImpl implements VehicleSubCategoryService {

    @Autowired
    private VehicleSubCategoryDAO vehicleSubcategoryDAO;
}