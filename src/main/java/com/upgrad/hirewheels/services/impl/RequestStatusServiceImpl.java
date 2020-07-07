package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.RequestStatusDAO;
import com.upgrad.hirewheels.services.RequestStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestStatusServiceImpl implements RequestStatusService {

    @Autowired
    private RequestStatusDAO requestStatusDAO;
}