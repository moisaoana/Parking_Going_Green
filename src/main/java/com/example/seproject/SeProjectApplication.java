package com.example.seproject;

import com.example.seproject.Model.ParkingSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@EnableCaching
public class SeProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeProjectApplication.class, args);
        ParkingSession parkingSession=new ParkingSession();
       // parkingSession.init();
    }
    /*@GetMapping("/hello") public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
       return String.format("Hello %s!", name); }*/

   /* @RequestMapping("/")
    public String index(){
        return "Login";
    }*/

}
