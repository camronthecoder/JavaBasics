package com.careerdevs.objectfactory.fruitFactory;

import com.careerdevs.objectfactory.UI;

//public fruit (String name, String color, boolean hasSeeds){
public class fruitMain {
    public static void main(String[] args) {
        System.out.println("fruit factory\n\n");
        String name = UI.readString("What is the fruits name?");
        String color = UI.readString("What is the fruits color?");
        boolean hasSeeds = UI.readBoolean("This fruit has seeds. ");

        fruit generateFruit = new fruit(name, color, hasSeeds);
        System.out.println(generateFruit);
    }
}
