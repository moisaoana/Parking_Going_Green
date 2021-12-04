package com.example.seproject.Controller;

import com.example.seproject.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }


    @PostMapping("/profile")
    public String greetingSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        return "profile";
    }

    /*@PostMapping("/login")
    public String greetingSubmit1(@ModelAttribute User user, Model model) {
        model.addAttribute("login", user);
        System.out.println(user.getUsername());
        return "result";
    }*/


}
