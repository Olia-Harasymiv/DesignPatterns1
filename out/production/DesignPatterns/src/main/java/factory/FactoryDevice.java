package main.java.factory;

import main.java.model.Ipad;
import main.java.model.Device;
import main.java.model.MacBook;

public class FactoryDevice {
    public static Device getDevice(String type, String screen, String color, String year, String market){
        if ("MacBook".equalsIgnoreCase(type)) return new MacBook(screen, color, year, market);
        else if("Ipad".equalsIgnoreCase(type)) return new Ipad(screen, color, year, market);
        return null;
    }
}