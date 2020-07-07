package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.VehicleCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("VehicleCategoryDAO")
public interface VehicleCategoryDAO extends JpaRepository<VehicleCategory,Integer> {
}
