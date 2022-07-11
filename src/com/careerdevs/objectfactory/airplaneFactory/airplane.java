package com.careerdevs.objectfactory.airplaneFactory;
//create class with all the variables
// generate constructer
//generate getters
//generate tostring

public class airplane {
    //modelName, tailNumber, passengerCap, gasTank, isFlying
    private String modelName;
    private String tailNumber;
    private short passengerCap;
    private int marketValue;
    private double gasTank;
    private boolean isFlying;

    public airplane(String modelName, String tailNumber, short passengerCap, int marketValue, double gasTank, boolean isFlying) {
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
        final StringBuilder sb = new StringBuilder("airplane{");
        sb.append("modelName='").append(modelName).append('\'');
        sb.append(", tailNumber='").append(tailNumber).append('\'');
        sb.append(", passengerCap=").append(passengerCap);
        sb.append(", marketValue=").append(marketValue);
        sb.append(", gasTank=").append(gasTank);
        sb.append(", isFlying=").append(isFlying);
        sb.append('}');
        return sb.toString();
    }
}