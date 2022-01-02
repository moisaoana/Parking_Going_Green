package com.example.seproject.Model;

import com.example.seproject.StartApp;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class StartClient implements StartApp {
    int port;
    public StartClient(int port){
        this.port=port;
    }
    public void openLocalHost() {
        applicationReadyEvent();
    }

    void applicationReadyEvent() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("http://localhost:");
        stringBuilder.append(this.port).append("/start");
        System.out.println("Starting browser now");
        browse(stringBuilder.toString());
    }

    public static void browse(String url) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                System.out.println("*");
                desktop.browse(new URI(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Runtime runtime = Runtime.getRuntime();
            try {
                System.out.println("k");
                runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}