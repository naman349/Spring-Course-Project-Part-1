package com.upgrad.hirewheels.daos;

import com.upgrad.hirewheels.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("LocationDAO")
public interface LocationDAO extends JpaRepository<Location,Integer> {
}
