package com.example.seproject.Model;

import java.io.IOException;

public interface Observer {
    public void update(String eventType) throws IOException;
}
