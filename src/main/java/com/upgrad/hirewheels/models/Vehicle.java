package com.upgrad.hirewheels.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Objects;

public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int vehicleId;
    @Column( nullable = false)
    private String vehicleModel;

    @Column( nullable = false)
    private  int userId;
    @Column( nullable = false)
    private  int vehicleNumber;

    private int vehicleSubCategoryId;



    @Column( nullable = false)
    private  String color;


    @Column( nullable = false)
    private int localId;
    @Column( nullable = false)
    private  int fuelTypeId;
    @Column( nullable = false)
    private  String vehicleImageUrl;

//default constructer
    public Vehicle(){}

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleSubCategoryId() {
        return vehicleSubCategoryId;
    }

    public void setVehicleSubCategoryId(int vehicleSubCategoryId) {
        this.vehicleSubCategoryId = vehicleSubCategoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLocalId() {
        return localId;
    }

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehicleId == vehicle.vehicleId &&
                userId == vehicle.userId &&
                vehicleNumber == vehicle.vehicleNumber &&
                vehicleSubCategoryId == vehicle.vehicleSubCategoryId &&
                localId == vehicle.localId &&
                fuelTypeId == vehicle.fuelTypeId &&
                Objects.equals(vehicleModel, vehicle.vehicleModel) &&
                Objects.equals(color, vehicle.color) &&
                Objects.equals(vehicleImageUrl, vehicle.vehicleImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId, vehicleModel, userId, vehicleNumber, vehicleSubCategoryId, color, localId, fuelTypeId, vehicleImageUrl);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", userId=" + userId +
                ", vehicleNumber=" + vehicleNumber +
                ", vehicleSubCategoryId=" + vehicleSubCategoryId +
                ", color='" + color + '\'' +
                ", localId=" + localId +
                ", fuelTypeId=" + fuelTypeId +
                ", vehicleImageUrl='" + vehicleImageUrl + '\'' +
                '}';
    }
}
