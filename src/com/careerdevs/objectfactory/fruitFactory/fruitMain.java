package com.careerdevs.objectfactory.fruitFactory;

import com.careerdevs.objectfactory.ui;

//public fruit (String name, String color, boolean hasSeeds){
public class fruitMain {
    public static void main(String[] args) {
        System.out.println("fruit factory\n\n");
        String name = ui.readString("What is the fruits name?");
        String color = ui.readString("What is the fruits color?");
        boolean hasSeeds = ui.readBoolean("This fruit has seeds. ");

        fruit generateFruit = new fruit(name, color, hasSeeds);
        System.out.println(generateFruit);
    }
}
