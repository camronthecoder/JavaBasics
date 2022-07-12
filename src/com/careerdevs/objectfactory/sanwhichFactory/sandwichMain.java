package com.careerdevs.objectfactory.sanwhichFactory;

import com.careerdevs.objectfactory.UI;

public class sandwichMain {
    public static void main(String[] args) {
        System.out.println("sandwich factory\n\n");
        int sandwichSize = UI.readInt("What is the size of the sanwhich in feet ?",0, 100);
        String breadType = UI.readString("What type of bread would you like?");
        String meatType = UI.readString("What type of meat?");
        String cheeseType = UI.readString("What type of cheese?");
        boolean cutType= UI.readBoolean("You want this sandwich cut in half. ");

        sandwich generateSandwich = new sandwich(sandwichSize, breadType, meatType, cheeseType, cutType);
        System.out.println(generateSandwich);
    }
}