package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CityDAO")
public interface CityDAO extends JpaRepository<City,Integer> {
}
