package com.example.seproject;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StartApp extends Remote{

    public void openLocalHost() throws RemoteException;
}
