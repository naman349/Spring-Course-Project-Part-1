
package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class VehicleSubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleSubCategoryId;

    @Column(nullable = false, unique = true)
    private String vehicleSubCategoryName;

    @Column(nullable = false)
    private int pricePerHour;

    @ManyToOne
    private VehicleCategory vehicleCategory;

    public int getVehicleSubCategoryId() {
        return vehicleSubCategoryId;
    }

    public void setVehicleSubCategoryId(int vehicleSubCategoryId) {
        this.vehicleSubCategoryId = vehicleSubCategoryId;
    }

    public String getVehicleSubcategoryName() {
        return vehicleSubCategoryName;
    }

    public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
        this.vehicleSubCategoryName = vehicleSubcategoryName;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }


    public VehicleSubCategory() {}

    public VehicleSubCategory(String vehicleSubcategoryName, int pricePerHour) {
        this.vehicleSubCategoryName = vehicleSubcategoryName;
        this.pricePerHour = pricePerHour;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleSubCategory that = (VehicleSubCategory) o;
        return vehicleSubCategoryId == that.vehicleSubCategoryId &&
                pricePerHour == that.pricePerHour &&
                Objects.equals(vehicleSubCategoryName, that.vehicleSubCategoryName) &&
                Objects.equals(vehicleCategory, that.vehicleCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleSubCategoryId, vehicleSubCategoryName, pricePerHour, vehicleCategory);
    }
}