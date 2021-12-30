package com.example.seproject.Controller;

import com.example.seproject.Model.*;
import com.example.seproject.SeProjectApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class ProfileController {
    String z1;
    String z2;

    @RequestMapping(value="/profile", method=RequestMethod.POST, params="action=search")
    public String greetingSubmit(@ModelAttribute User user,Model model, @RequestParam(value="action", required=true) String action,@RequestParam String zone,@RequestParam String zone2) {
        model.addAttribute("user",user);
        ParkingSession parkingSession = new ParkingSession();
        CopyOnWriteArrayList<Zone> zones = parkingSession.getZones();
        model.addAttribute("zones", zones);
        List<ElectricCar>cars=new ArrayList<>();
        List<ParkingStation> stations= new ArrayList<>();
        int spots=0;
        for(Zone z: zones){
            if(z.getName().equals(zone)){
                for(ParkingStation p: z.getParkingStationList()){
                    cars.addAll(p.getParkedCars());
                }
            }
            if(z.getName().equals(zone2)){
                stations=z.getParkingStationList();
                for(ParkingStation p: z.getParkingStationList()){
                    spots+=p.getAvailableSpots();
                }
            }
        }

        String location=zone;
        String destination=zone2;
        this.z1=location;
        this.z2=destination;

        model.addAttribute("cars",cars);
        model.addAttribute("spots",spots);
        model.addAttribute("location",location);
        model.addAttribute("destination",destination);
        model.addAttribute("stations",stations);
        return "profile";
    }
    @RequestMapping(value="/profile", method=RequestMethod.POST, params="action=submit")
    public String rentSubmit(@ModelAttribute User user,Model model, @RequestParam(value="action", required=true) String action,@RequestParam("car") String car,@RequestParam String zone,@RequestParam String zone2,@RequestParam("station") String station) throws IOException {
        System.out.println(car);
        System.out.println(station);
        model.addAttribute("car",car);
        model.addAttribute("station",station);
        // String location=zone;
        // String destination=zone2;
        String location=this.z1;
        String destination=this.z2;
        System.out.println(location);
        System.out.println(destination);
        ElectricCar rentCar=null;
        model.addAttribute("location",location);
        model.addAttribute("destination",destination);
        ParkingSession parkingSession = new ParkingSession();
        CopyOnWriteArrayList<Zone> zones = parkingSession.getZones();
        for(Zone z: zones) {
            if (z.getName().equals(location)) {
                for (ParkingStation p : z.getParkingStationList()) {
                    for (Iterator<ElectricCar> it = p.getParkedCars().iterator(); it.hasNext(); ) {
                        ElectricCar electricCar = it.next();
                        if (electricCar.getLicensePlate().equals(car)) {
                            rentCar = new ElectricCar(electricCar.getLicensePlate(), electricCar.getParkingStation(), electricCar.isAvailable(), electricCar.getStatus());
                            it.remove();
                            p.setAvailableSpots(p.getAvailableSpots() + 1);
                        }
                    }

                }
            }
        }
        for(Zone z: zones) {
            if (z.getName().equals(destination)) {
                for (ParkingStation p : z.getParkingStationList()) {
                    if (p.getNumber() == Integer.parseInt(station)) {
                        p.setAvailableSpots(p.getAvailableSpots() - 1);
                        p.getParkedCars().add(rentCar);
                    }
                }
            }
        }
        for(Zone zone1 : zones){
            System.out.println(zone1.getName());
            for(ParkingStation parkingStation: zone1.getParkingStationList()){
                System.out.println(parkingStation.getNumber());
                for(ElectricCar electricCar: parkingStation.getParkedCars()){
                    System.out.println(electricCar.getLicensePlate());
                }
            }
        }
        Serializator.serializeZones(zones,"D:\\AN 3\\SEM1\\SE\\ProiectSE\\SE-Project\\src\\main\\java\\com\\example\\seproject\\zones.txt");
        SeProjectApplication.event.notify("New car rent");
        return "rent";
    }

    @GetMapping("/profile")
    public static String handleGetRequest(Model model) {
        model.addAttribute("user", new User());
        return "profile";
    }
}
