package com.example.seproject;

import com.example.seproject.Model.Admin;
import com.example.seproject.Model.Observable;
import com.example.seproject.Model.ParkingSession;
import com.example.seproject.Model.StartClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@EnableCaching
public class SeProjectApplication {
    public static Observable event = new Observable();
    public static void main(String[] args) {

        SpringApplication.run(SeProjectApplication.class, args);
        ParkingSession parkingSession=new ParkingSession();
        //parkingSession.init();

        StartClient client1=new StartClient(8080);
        /*StartClient client2=new StartClient(8080);
        StartClient client3=new StartClient(8080);
        StartClient client4=new StartClient(8080);
        StartClient client5=new StartClient(8080);*/

        Admin admin = new Admin(8080);
        List<String> strings= new ArrayList<>();
        strings.add("New car rent");
        event.setListeners(strings);

        try {

            StartApp stubClient = (StartApp) UnicastRemoteObject.exportObject(client1, 0);
            //StartApp stubAdmin= (StartApp) UnicastRemoteObject.exportObject(admin, 0);

            Registry registry = LocateRegistry.getRegistry();

            registry.bind("com.example.seproject.StartApp", stubClient);
            //registry.bind("com.example.seproject.StartApp", stubAdmin);
            System.err.println("Server ready");
            System.getProperty("java.class.path");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }

        //System.getProperty("java.class.path");


        /*Thread thread1=new Thread(client1);
        thread1.start();
        Thread thread2=new Thread(client2);
        thread2.start();
        Thread thread3=new Thread(client3);
        thread3.start();
        Thread thread4=new Thread(client4);
        thread4.start();
        Thread thread5=new Thread(client5);
        thread5.start();

        Thread threadAdmin=new Thread(admin);
        threadAdmin.start();*/


        admin.openLocalHost();
    }

}
