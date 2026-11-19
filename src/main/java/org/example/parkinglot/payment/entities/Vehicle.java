package org.example.parkinglot.payment.entities;

import org.example.parkinglot.payment.enums.VehicleType;

public class Vehicle {
    private String vehicleNum;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNum,VehicleType vehicleType){
        this.vehicleNum = vehicleNum;
        this.vehicleType = vehicleType;
    }


    public String getVehicleNum(){
        return this.vehicleNum;
    }

    public VehicleType getVehicleType(){
        return this.vehicleType;
    }

}
