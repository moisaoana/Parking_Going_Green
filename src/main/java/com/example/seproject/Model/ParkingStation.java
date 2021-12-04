package com.example.seproject.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ParkingStation implements Serializable {
    private int number;
    private Zone zone;
    private int capacity;
    private int availableSpots;
    private List<ElectricCar> parkedCars=new ArrayList<>();
   public ParkingStation(int number, Zone zone, int capacity, int availableSpots, List<ElectricCar> parkedCars){
       this.number=number;
       this.zone=zone;
       this.capacity=capacity;
       this.availableSpots=availableSpots;
       this.parkedCars=parkedCars;
   }
    public ParkingStation(int number, List<ElectricCar> parkedCars, int capacity, int availableSpots){
        this.number=number;
        this.parkedCars=parkedCars;
        this.capacity=capacity;
        this.availableSpots=availableSpots;
    }
    public ParkingStation(int number, int capacity, int availableSpots){
        this.number=number;
        this.capacity=capacity;
        this.availableSpots=availableSpots;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }

    public List<ElectricCar> getParkedCars() {
        return parkedCars;
    }

    public void setParkedCars(List<ElectricCar> parkedCars) {
        this.parkedCars = parkedCars;
    }
}
