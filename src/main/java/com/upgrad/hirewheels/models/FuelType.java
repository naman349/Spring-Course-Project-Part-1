package com.upgrad.hirewheels.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class FuelType {

    @Id
    private int fuelTypeId;


    @Column(nullable = false)
    private String roleName;


}
