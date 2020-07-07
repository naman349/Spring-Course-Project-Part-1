
package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.BookingDAO;
import com.upgrad.hirewheels.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDAO bookingDAO;
}