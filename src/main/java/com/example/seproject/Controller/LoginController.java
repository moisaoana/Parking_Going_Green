package com.example.seproject.Controller;

import com.example.seproject.Model.*;
import com.example.seproject.SeProjectApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/profile")
    public String greetingSubmit(@ModelAttribute User user, Model model) {
        SeProjectApplication.event.subscribe("New car rent",user);
        for(Observer obs: SeProjectApplication.event.getListeners("New car rent")){
            if(obs instanceof User){
                System.out.println(((User) obs).getUsername());
            }
        }
        model.addAttribute("user", user);
        ParkingSession parkingSession = new ParkingSession();
        CopyOnWriteArrayList<Zone> zones = parkingSession.getZones();
        model.addAttribute("zones", zones);
        return "profile";
    }
}
