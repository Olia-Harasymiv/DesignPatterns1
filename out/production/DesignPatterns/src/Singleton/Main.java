package Singleton;


import Singleton.main.java.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton q = Singleton.getInstance();
        Singleton w = Singleton.getInstance();

        w.string =(w.string).toLowerCase();
        System.out.println("Text w is " + w.string);
        System.out.println("Text q is " + q.string);

    }
}
