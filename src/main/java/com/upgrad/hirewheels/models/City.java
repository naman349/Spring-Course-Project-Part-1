package com.upgrad.hirewheels.models;

import javax.persistence.Column;
import javax.persistence.Id;

public class City {

    @Id
    private int cityId;


    @Column(nullable = false)
    private String cityName;

}
