package com.careerdevs.objectfactory.airplane;

import com.careerdevs.objectfactory.ui;

public class Main {
    public static void main (String[] args){
        System.out.println("airplaine factory\n\n");

        String modelName = ui.readString("what is the model name ");
        String tailNumber = ui.readString("what ist the tail number?");
        short passengerCap = ui.readShort("what is the passenger cap?", (short) 0, (short) 300);
        int marketValue = ui.readInt("what is the market value?", 0, 100000000);
        double gasTank = ui.readDouble("what is the gas tank percentage?", 0, 1);
        boolean isFlying = ui.readBoolean("Is the plane flying?");
        airplane generateplane = new airplane(modelName, tailNumber, passengerCap, marketValue, gasTank, isFlying);
        System.out.println(generateplane);
    }}