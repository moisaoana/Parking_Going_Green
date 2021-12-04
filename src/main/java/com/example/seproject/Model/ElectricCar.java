package com.example.seproject.Model;

import java.io.Serializable;

public class ElectricCar implements Serializable {
    private String licensePlate;
    private ParkingStation parkingStation;
    private boolean available;
    private ChargingStatus status;
    public ElectricCar(String licensePlate, ParkingStation parkingStation, boolean available, ChargingStatus chargingStatus){
        this.licensePlate=licensePlate;
        this.parkingStation=parkingStation;
        this.available=available;
        this.status=chargingStatus;
    }
    public ElectricCar(String licensePlate, boolean available, ChargingStatus chargingStatus){
        this.licensePlate=licensePlate;
        this.available=available;
        this.status=chargingStatus;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public ParkingStation getParkingStation() {
        return parkingStation;
    }

    public void setParkingStation(ParkingStation parkingStation) {
        this.parkingStation = parkingStation;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public ChargingStatus getStatus() {
        return status;
    }

    public void setStatus(ChargingStatus status) {
        this.status = status;
    }
}
