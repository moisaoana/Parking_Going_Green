package com.example.seproject.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializator implements Serializable {
    public static List<Zone> deserializeZones(){
        List<Zone> zones=new ArrayList<>();
        FileInputStream file = null;
        try {
            file = new FileInputStream("src\\main\\resources\\zones.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        try {
            if(file.available()>0) {
                ObjectInputStream in = new ObjectInputStream(file);
                zones= (List) in.readObject();
                in.close();
            }
            file.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return zones;
    }
    public static void serializeZones(List<Zone> zones, String filename){
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
