package main.java.model;

public class MacBook extends Device {
    private String type;
    private String screen;
    private String color;
    private String year;

    public MacBook(String type, String screen, String color, String year) {
        this.type = type;
        this.screen = screen;
        this.color = color;
        this.year = year;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getScreen() {
        return this.screen;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getYear() {
        return this.year;
    }
}
