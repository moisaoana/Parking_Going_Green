package com.example.seproject.Model;

import com.example.seproject.Controller.ProfileController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;

public class User implements Observer{
    private String username;
    private String password;
    private Zone currentZone;
    private Zone destinationZone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Zone getCurrentZone() {
        return currentZone;
    }

    public void setCurrentZone(Zone currentZone) {
        this.currentZone = currentZone;
    }

    public Zone getDestinationZone() {
        return destinationZone;
    }

    public void setDestinationZone(Zone destinationZone) {
        this.destinationZone = destinationZone;
    }

    @Override
    public void update(String eventType) throws IOException {
        System.out.println("notify");
    }
}
