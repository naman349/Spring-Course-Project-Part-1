package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("FuelTypeDAO")
public interface FuelTypeDAO extends JpaRepository<FuelType,Integer> {





}
