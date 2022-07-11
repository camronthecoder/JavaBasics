package com.careerdevs.objectfactory.sanwhichFactory;

import com.careerdevs.objectfactory.ui;

public class sandwichMain {
    public static void main(String[] args) {
        System.out.println("sandwich factory\n\n");
        int sandwichSize = ui.readInt("What is the size of the sanwhich in feet ?",0, 100);
        String breadType = ui.readString("What type of bread would you like?");
        String meatType = ui.readString("What type of meat?");
        String cheeseType = ui.readString("What type of cheese?");
        boolean cutType= ui.readBoolean("You want this sandwich cut in half. ");

        sandwich generateSandwich = new sandwich(sandwichSize, breadType, meatType, cheeseType, cutType);
        System.out.println(generateSandwich);
    }
}