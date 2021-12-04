package com.example.seproject.Controller;

import com.example.seproject.Model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProfileController {


    @RequestMapping(value="/profile", method=RequestMethod.POST, params="action=search")
    public String greetingSubmit(@ModelAttribute User user,Model model, @RequestParam(value="action", required=true) String action,@RequestParam String zone,@RequestParam String zone2) {
        model.addAttribute("user",user);
        ParkingSession parkingSession = new ParkingSession();
        List<Zone> zones = parkingSession.getZones();
        model.addAttribute("zones", zones);
        List<ElectricCar>cars=new ArrayList<>();
        int spots=0;
        for(Zone z: zones){
            if(z.getName().equals(zone)){
                for(ParkingStation p: z.getParkingStationList()){
                    cars.addAll(p.getParkedCars());
                }
            }
            if(z.getName().equals(zone2)){
                for(ParkingStation p: z.getParkingStationList()){
                    spots=p.getAvailableSpots();
                }
            }
        }
        String location=zone;
        String destination=zone2;
        model.addAttribute("cars",cars);
        model.addAttribute("spots",spots);
        model.addAttribute("location",location);
        model.addAttribute("destination",destination);
        return "profile";
    }
    @GetMapping("/profile")
    public String handleGetRequest(Model model) {
        model.addAttribute("user", new User());
        return "profile";
    }
}
