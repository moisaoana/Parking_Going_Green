package com.example.seproject.Controller;
import com.example.seproject.Model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@Controller
public class AdminController {
    @GetMapping("/admin")
    public String handleGetRequest(Model model) {
        ParkingSession parkingSession = new ParkingSession();
        List<Zone> zones = parkingSession.getZones();
        model.addAttribute("zones", zones);
        List<ParkingStation> parkingStations;
        parkingStations = parkingSession.getZones().get(0).getParkingStationList();
        model.addAttribute("parkingStations", parkingStations);
        return "admin";
    }

    @RequestMapping(value="/admin", method=RequestMethod.POST, params="action=search")
    public String adminForm(Model model, @RequestParam String zone, @RequestParam int parkingStation) {
        ParkingSession parkingSession = new ParkingSession();
        List<Zone> zones = parkingSession.getZones();
        model.addAttribute("zones", zones);
        List<ParkingStation> parkingStations = new ArrayList<>();
        List<ElectricCar>cars=new ArrayList<>();
        int spots=0;
        for(Zone z: zones) {
            if (z.getName().equals(zone)) {
                parkingStations.addAll(z.getParkingStationList());
            }
        }
        for (ParkingStation p : parkingStations) {
            if (p.getNumber() == parkingStation) {
                cars.addAll(p.getParkedCars());
                spots = p.getAvailableSpots();
            }
        }
        String location=zone + ", parking station "+ parkingStation;
        model.addAttribute("parkingStations", parkingStations);
        model.addAttribute("cars", cars);
        model.addAttribute("spots", spots);
        model.addAttribute("location",location);
        return "admin";
    }
}

