package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

public class VehicleSubCategory {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleSubCategoryId;

    @Column( nullable = false,unique=true)
    private  String vehicleSubCategoryName;

    @Column( nullable = false)
    private float pricePerHour;

    @Column( nullable = false)
    private  int vehicleCategoryId;

    public VehicleSubCategory(){}

    public String getVehicleSubCategoryName() {
        return vehicleSubCategoryName;
    }

    public void setVehicleSubCategoryName(String vehicleSubCategoryName) {
        this.vehicleSubCategoryName = vehicleSubCategoryName;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleSubCategory that = (VehicleSubCategory) o;
        return vehicleSubCategoryId == that.vehicleSubCategoryId &&
                Float.compare(that.pricePerHour, pricePerHour) == 0 &&
                vehicleCategoryId == that.vehicleCategoryId &&
                Objects.equals(vehicleSubCategoryName, that.vehicleSubCategoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleSubCategoryId, vehicleSubCategoryName, pricePerHour, vehicleCategoryId);
    }

    @Override
    public String toString() {
        return "VehicleSubCategory{" +
                "vehicleSubCategoryId=" + vehicleSubCategoryId +
                ", vehicleSubCategoryName='" + vehicleSubCategoryName + '\'' +
                ", pricePerHour=" + pricePerHour +
                ", vehicleCategoryId=" + vehicleCategoryId +
                '}';
    }
}
