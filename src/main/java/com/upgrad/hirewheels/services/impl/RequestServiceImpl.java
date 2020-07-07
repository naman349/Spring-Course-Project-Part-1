
package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.RequestDAO;
import com.upgrad.hirewheels.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    private RequestDAO requestDAO;
}