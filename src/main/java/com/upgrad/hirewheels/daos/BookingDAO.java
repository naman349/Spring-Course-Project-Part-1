package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("BookingDAO")
public interface BookingDAO  extends JpaRepository<Booking, Integer> {


}
