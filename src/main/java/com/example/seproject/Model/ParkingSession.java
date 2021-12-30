package com.example.seproject.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ParkingSession {
    private CopyOnWriteArrayList<Zone> zones=new CopyOnWriteArrayList<>();
    public ParkingSession(){
        zones=Serializator.deserializeZones();
    }

    public CopyOnWriteArrayList<Zone> getZones() {
        return zones;
    }

    public void setZones(CopyOnWriteArrayList<Zone> zones) {
        this.zones = zones;
    }

    public void init(){
        ElectricCar electricCar1=new ElectricCar("CJ10AAA",true,ChargingStatus.full);
        ElectricCar electricCar2=new ElectricCar("CJ10AAB",true,ChargingStatus.medium);
        ElectricCar electricCar3=new ElectricCar("CJ10AAC",true,ChargingStatus.full);
        ElectricCar electricCar4=new ElectricCar("CJ10AAD",true,ChargingStatus.low);
        ElectricCar electricCar5=new ElectricCar("CJ10AAE",true,ChargingStatus.medium);
        ElectricCar electricCar6=new ElectricCar("CJ10AAF",true,ChargingStatus.full);
        ElectricCar electricCar7=new ElectricCar("CJ10AAG",true,ChargingStatus.full);
        ElectricCar electricCar8=new ElectricCar("CJ10AAH",true,ChargingStatus.full);
        ElectricCar electricCar9=new ElectricCar("CJ10AAI",true,ChargingStatus.full);
        ElectricCar electricCar10=new ElectricCar("CJ10AAJ",true,ChargingStatus.medium);
        ElectricCar electricCar11=new ElectricCar("CJ10AAK",true,ChargingStatus.full);
        ElectricCar electricCar12=new ElectricCar("CJ10AAL",true,ChargingStatus.full);
        ElectricCar electricCar13=new ElectricCar("CJ10AAM",true,ChargingStatus.full);
        ElectricCar electricCar14=new ElectricCar("CJ10AAN",true,ChargingStatus.medium);
        ElectricCar electricCar15=new ElectricCar("CJ10AAO",true,ChargingStatus.full);
        ElectricCar electricCar16=new ElectricCar("CJ10AAP",true,ChargingStatus.full);
        ElectricCar electricCar17=new ElectricCar("CJ10AAQ",true,ChargingStatus.full);
        ElectricCar electricCar18=new ElectricCar("CJ10AAR",true,ChargingStatus.full);
        ElectricCar electricCar19=new ElectricCar("CJ10AAS",true,ChargingStatus.full);
        ElectricCar electricCar20=new ElectricCar("CJ10AAT",true,ChargingStatus.medium);
        ElectricCar electricCar21=new ElectricCar("CJ10AAU",true,ChargingStatus.full);
        ElectricCar electricCar22=new ElectricCar("CJ10AAV",true,ChargingStatus.low);
        ElectricCar electricCar23=new ElectricCar("CJ10AAW",true,ChargingStatus.full);
        ElectricCar electricCar24=new ElectricCar("CJ10AAX",true,ChargingStatus.full);
        ElectricCar electricCar25=new ElectricCar("CJ10AAY",true,ChargingStatus.medium);
        ElectricCar electricCar26=new ElectricCar("CJ10AAZ",true,ChargingStatus.full);
        ElectricCar electricCar27=new ElectricCar("CJ10ABB",true,ChargingStatus.full);
        ElectricCar electricCar28=new ElectricCar("CJ10ACC",true,ChargingStatus.full);
        ElectricCar electricCar29=new ElectricCar("CJ10ADD",true,ChargingStatus.full);
        ElectricCar electricCar30=new ElectricCar("CJ10AEE",true,ChargingStatus.low);

        List<ElectricCar> listMarastiP1=new ArrayList<>();
        listMarastiP1.add(electricCar1);
        listMarastiP1.add(electricCar2);
        listMarastiP1.add(electricCar3);
        List<ElectricCar> listMarastiP2=new ArrayList<>();
        listMarastiP2.add(electricCar4);
        listMarastiP2.add(electricCar5);
        listMarastiP2.add(electricCar6);
        ParkingStation parkingStation1=new ParkingStation(1,listMarastiP1,5,2);
        ParkingStation parkingStation2=new ParkingStation(2,listMarastiP2,5,2);
        electricCar1.setParkingStation(parkingStation1);
        electricCar2.setParkingStation(parkingStation1);
        electricCar3.setParkingStation(parkingStation1);
        electricCar4.setParkingStation(parkingStation2);
        electricCar5.setParkingStation(parkingStation2);
        electricCar6.setParkingStation(parkingStation2);

        List<ParkingStation>parkingStationsMarasti=new ArrayList<>();
        parkingStationsMarasti.add(parkingStation1);
        parkingStationsMarasti.add(parkingStation2);

        Zone zoneMarasti=new Zone("Marasti",parkingStationsMarasti);
        parkingStation1.setZone(zoneMarasti);
        parkingStation2.setZone(zoneMarasti);


        //////////////////////////////
        List<ElectricCar> listZorilorP1=new ArrayList<>();
        listZorilorP1.add(electricCar7);
        listZorilorP1.add(electricCar8);
        listZorilorP1.add(electricCar9);
        List<ElectricCar> listZorilorP2=new ArrayList<>();
        listZorilorP2.add(electricCar10);
        listZorilorP2.add(electricCar11);
        listZorilorP2.add(electricCar12);
        ParkingStation parkingStation1Zorilor=new ParkingStation(1,listZorilorP1,5,2);
        ParkingStation parkingStation2Zorilor=new ParkingStation(2,listZorilorP2,5,2);
        electricCar7.setParkingStation(parkingStation1Zorilor);
        electricCar8.setParkingStation(parkingStation1Zorilor);
        electricCar9.setParkingStation(parkingStation1Zorilor);
        electricCar10.setParkingStation(parkingStation2Zorilor);
        electricCar11.setParkingStation(parkingStation2Zorilor);
        electricCar12.setParkingStation(parkingStation2Zorilor);

        List<ParkingStation>parkingStationsZorilor=new ArrayList<>();
        parkingStationsZorilor.add(parkingStation1Zorilor);
        parkingStationsZorilor.add(parkingStation2Zorilor);

        Zone zoneZorilor=new Zone("Zorilor",parkingStationsZorilor);
        parkingStation1Zorilor.setZone(zoneZorilor);
        parkingStation2Zorilor.setZone(zoneZorilor);
        ////////////////////////////

        List<ElectricCar> listGhP1=new ArrayList<>();
        listGhP1.add(electricCar13);
        listGhP1.add(electricCar14);
        listGhP1.add(electricCar15);
        List<ElectricCar> listGhP2=new ArrayList<>();
        listGhP2.add(electricCar16);
        listGhP2.add(electricCar17);
        listGhP2.add(electricCar18);
        ParkingStation parkingStation1Gh=new ParkingStation(1,listGhP1,5,2);
        ParkingStation parkingStation2Gh=new ParkingStation(2,listGhP2,5,2);
        electricCar13.setParkingStation(parkingStation1Gh);
        electricCar14.setParkingStation(parkingStation1Gh);
        electricCar15.setParkingStation(parkingStation1Gh);
        electricCar16.setParkingStation(parkingStation2Gh);
        electricCar17.setParkingStation(parkingStation2Gh);
        electricCar18.setParkingStation(parkingStation2Gh);

        List<ParkingStation>parkingStationsGh=new ArrayList<>();
        parkingStationsGh.add(parkingStation1Gh);
        parkingStationsGh.add(parkingStation2Gh);

        Zone zoneGh=new Zone("Gheorgheni",parkingStationsGh);
        parkingStation1Gh.setZone(zoneGh);
        parkingStation2Gh.setZone(zoneGh);
        ///////////////////////

        List<ElectricCar> listManasturP1=new ArrayList<>();
        listManasturP1.add(electricCar19);
        listManasturP1.add(electricCar20);
        listManasturP1.add(electricCar21);
        List<ElectricCar> listManasturP2=new ArrayList<>();
        listManasturP2.add(electricCar22);
        listManasturP2.add(electricCar23);
        listManasturP2.add(electricCar24);
        ParkingStation parkingStation1Manastur=new ParkingStation(1,listManasturP1,5,2);
        ParkingStation parkingStation2Manastur=new ParkingStation(2,listManasturP2,5,2);
        electricCar19.setParkingStation(parkingStation1Manastur);
        electricCar20.setParkingStation(parkingStation1Manastur);
        electricCar21.setParkingStation(parkingStation1Manastur);
        electricCar22.setParkingStation(parkingStation2Manastur);
        electricCar23.setParkingStation(parkingStation2Manastur);
        electricCar24.setParkingStation(parkingStation2Manastur);

        List<ParkingStation>parkingStationsManastur=new ArrayList<>();
        parkingStationsManastur.add(parkingStation1Manastur);
        parkingStationsManastur.add(parkingStation2Manastur);

        Zone zoneManastur=new Zone("Manastur",parkingStationsManastur);
        parkingStation1Manastur.setZone(zoneManastur);
        parkingStation2Manastur.setZone(zoneManastur);
        //////////////////////

        List<ElectricCar> listCentruP1=new ArrayList<>();
        listCentruP1.add(electricCar25);
        listCentruP1.add(electricCar26);
        listCentruP1.add(electricCar27);
        List<ElectricCar> listCentruP2=new ArrayList<>();
        listCentruP2.add(electricCar28);
        listCentruP2.add(electricCar29);
        listCentruP2.add(electricCar30);
        ParkingStation parkingStation1Centru=new ParkingStation(1,listCentruP1,5,2);
        ParkingStation parkingStation2Centru=new ParkingStation(2,listCentruP2,5,2);
        electricCar25.setParkingStation(parkingStation1Centru);
        electricCar26.setParkingStation(parkingStation1Centru);
        electricCar27.setParkingStation(parkingStation1Centru);
        electricCar28.setParkingStation(parkingStation2Centru);
        electricCar29.setParkingStation(parkingStation2Centru);
        electricCar30.setParkingStation(parkingStation2Centru);

        List<ParkingStation>parkingStationsCentru=new ArrayList<>();
        parkingStationsCentru.add(parkingStation1Centru);
        parkingStationsCentru.add(parkingStation2Centru);

        Zone zoneCentru=new Zone("Centru",parkingStationsCentru);
        parkingStation1Centru.setZone(zoneCentru);
        parkingStation2Centru.setZone(zoneCentru);

        //////////////////////

        zones.add(zoneMarasti);
        zones.add(zoneZorilor);
        zones.add(zoneGh);
        zones.add(zoneManastur);
        zones.add(zoneCentru);

        Serializator.serializeZones(zones,"D:\\Anul_3\\SE\\Final_Project\\SE-Project\\src\\main\\java\\com\\example\\seproject\\zones.txt");
    }


}
