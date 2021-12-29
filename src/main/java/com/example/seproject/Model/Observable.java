package com.example.seproject.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Observable {
        Map<String, List<Observer>> listeners = new HashMap<>();

        public void setListeners(List<String> operations) {
            for (String operation : operations) {
                this.listeners.put(operation, new ArrayList<>());
            }
        }

        public void subscribe(String eventType, Observer listener) {
            List<Observer> users = listeners.get(eventType);
            users.add(listener);
        }

        public void unsubscribe(String eventType, Observer listener) {
            List<Observer> users = listeners.get(eventType);
            users.remove(listener);
        }

        public void notify(String eventType) throws IOException {
            List<Observer> users = listeners.get(eventType);
            for (Observer listener : users) {
                listener.update(eventType);
            }
        }

        public List<Observer> getListeners(String eventType){
           return listeners.get(eventType);
        }



}
