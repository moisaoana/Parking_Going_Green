package com.example.seproject.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Zone implements Serializable {
    private String name;
    private List<ParkingStation> parkingStationList=new ArrayList<>();
    public Zone(String name, List<ParkingStation> parkingStationList){
        this.name=name;
        this.parkingStationList=parkingStationList;
    }
    public Zone(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingStation> getParkingStationList() {
        return parkingStationList;
    }

    public void setParkingStationList(List<ParkingStation> parkingStationList) {
        this.parkingStationList = parkingStationList;
    }
}
