package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.VehicleSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("VehicleSubCategory")
public interface VehicleSubCategoryDAO extends JpaRepository<VehicleSubCategory,Integer> {
}
