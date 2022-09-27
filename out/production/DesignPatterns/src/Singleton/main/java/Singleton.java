package Singleton.main.java;

public class Singleton {
        private static Singleton instance;
        public String string;
        private Singleton() {
            string = "Simple text";
        }
        public static Singleton getInstance() {
            if(instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

