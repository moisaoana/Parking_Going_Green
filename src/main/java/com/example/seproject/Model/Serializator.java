package com.example.seproject.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Serializator implements Serializable {
    public static CopyOnWriteArrayList<Zone> deserializeZones(){
        CopyOnWriteArrayList<Zone> zones=new CopyOnWriteArrayList<>();
        FileInputStream file = null;
        try {
            file = new FileInputStream("D:\\AN 3\\SEM1\\SE\\ProiectSE\\SE-Project\\src\\main\\java\\com\\example\\seproject\\zones.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        try {
            if(file.available()>0) {
                ObjectInputStream in = new ObjectInputStream(file);
                zones= (CopyOnWriteArrayList) in.readObject();
                in.close();
            }
            file.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return zones;
    }
    public static void serializeZones(CopyOnWriteArrayList<Zone> zones, String filename){
        FileOutputStream file = null;
        try {
            file = new FileOutputStream(filename);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(file);
            out.writeObject(zones);
            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
