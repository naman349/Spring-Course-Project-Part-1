package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("VehicleDAO")
public interface VehicleDAO extends JpaRepository<Vehicle,Integer> {







}
