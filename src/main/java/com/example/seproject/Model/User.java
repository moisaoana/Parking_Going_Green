package com.example.seproject.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

public class User {
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
}
