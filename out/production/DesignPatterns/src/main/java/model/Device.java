package main.java.model;

public abstract class Device {
    public abstract String getType();
    public abstract String getScreen();
    public abstract String getColor();
    public abstract String getYear();

    @Override
    public String toString(){return "[Phone model - " + this.getYear() +
            ", screen - " + this.getType() +
            ", ... - " + this.getScreen() + " ....... - "
            + this.getColor() + "]";}
}
