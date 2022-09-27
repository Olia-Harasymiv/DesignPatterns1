package main.java.model;


public class Ipad extends Device {
    private String screenDiagonal;
    private String mPOfCamera;
    private String memory;

    public Ipad(String screenDiagonal, String mPOfCamera, String memory, String modelPhone) {
        this.screenDiagonal = screenDiagonal;
        this.mPOfCamera = mPOfCamera;
        this.memory = memory;
        this.modelPhone = modelPhone;
    }

    private String modelPhone;
    @Override
    public String getType() {
        return this.screenDiagonal;
    }

    @Override
    public String getScreen() {
        return this.mPOfCamera;
    }

    @Override
    public String getColor() {
        return this.memory;
    }

    @Override
    public String getYear() {
        return this.modelPhone;
    }
}