package com.example.seproject;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(null);
            StartApp stub = (StartApp) registry.lookup("com.example.seproject.StartApp");

            stub.openLocalHost();

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
