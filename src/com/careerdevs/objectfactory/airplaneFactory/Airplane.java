package com.careerdevs.objectfactory.airplaneFactory;
//create class with all the variables
// generate constructer
//generate getters
//generate tostring

public class Airplane {
    //modelName, tailNumber, passengerCap, gasTank, isFlying
    private String modelName;
    private String tailNumber;
    private short passengerCap;
    private int marketValue;
    private double gasTank;
    private boolean isFlying;

    public Airplane(String modelName, String tailNumber, short passengerCap, int marketValue, double gasTank, boolean isFlying) {
        this.modelName = modelName;
        this.tailNumber = tailNumber;
        this.passengerCap = passengerCap;
        this.marketValue = marketValue;
        this.gasTank = gasTank;
        this.isFlying = isFlying;
    }

    public String getModelName() {
        return modelName;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public short getPassengerCap() {
        return passengerCap;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public double getGasTank() {
        return gasTank;
    }

    public boolean isFlying() {
        return isFlying;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Model:'").append(modelName).append('\'');
        sb.append("\nTail Number: '").append(tailNumber).append('\'');
        sb.append("\nPassenger Cap: '").append(passengerCap);
        sb.append("\nMarket Value: ").append(marketValue);
        sb.append("\nFuel %: ").append(gasTank);
        //(condition) ? (if true, do this) : (otherwise, do this)
        sb.append(isFlying ? "The plane is 35,000 ft in the air!" : "The plane is on the ground");
        return sb.toString();
    }
}