package main;

import main.java.factory.FactoryDevice;
import main.java.model.Device;

public class Main {

    public static void main(String[] args) {
        Device macBook = FactoryDevice.getDevice("macBook", "15", "silver", "2018", "AppleStore");
        Device iPad = FactoryDevice.getDevice("iPad", "12", "silver", "2020", "AppleStore");
        System.out.println("Factory mac - " + macBook);
        System.out.println("Factory ipad Config - " + iPad);
    }
}
