package com.example.seproject.Controller;
import com.example.seproject.Model.ParkingSession;
import com.example.seproject.Model.User;
import com.example.seproject.Model.Zone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
@Controller
public class StartController {

    @GetMapping("/start")
    public String startForm(Model model) {
        return "start";
    }
    /*
    @PostMapping("/login")
    public String startSubmit(Model model) {
        return "login";
    }

     */
}