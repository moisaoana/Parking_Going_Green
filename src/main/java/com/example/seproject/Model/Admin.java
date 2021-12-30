package com.example.seproject.Model;

import com.example.seproject.StartApp;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class Admin extends User  {
    int port;
    public Admin(int port){
        this.port=port;
    }
    public void openLocalHost() {
        applicationReadyEvent();
    }

    //@EventListener({ApplicationReadyEvent.class})
    void applicationReadyEvent() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("http://localhost:");
        stringBuilder.append(this.port).append("/admin");
        System.out.println("Application started ... launching browser now");
        browse(stringBuilder.toString());
    }

    public static void browse(String url) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*@Override
    public void run() {
        openLocalHost();
    }*/

}
