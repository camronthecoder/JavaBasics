package com.careerdevs.carproject;

public class Car {
    private String make;
    private String model;
    private int speed;
    private  int mileage;
    private float gasTankPercent;

    public Car(String make, String model, int speed, int mileage, float gasTankPercent) {
        this.make = make;
        this.model= model;
        this.speed = speed;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public float getGasTankPercent() {
        return gasTankPercent;
    }

    public void setGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }

}
//make car constructor
//make an instance of a car using constructor
//output info