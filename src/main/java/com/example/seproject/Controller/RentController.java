package com.example.seproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RentController {
    @GetMapping("/rent")
    public String rentForm(Model model) {
        return "rent";
    }
}
