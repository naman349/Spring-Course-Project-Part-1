package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.ActivityDAO;
import com.upgrad.hirewheels.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityDAO activityDAO;
}