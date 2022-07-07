package com.careerdevs.objectfactory.animalFactory;

import com.careerdevs.objectfactory.ui;

public class animalMain {
    public static void main(String[] args) {
        System.out.println("animal factory\n\n");
        String species = ui.readString("what is the species?");
        int legs = ui.readInt("How many legs does it have", 0,10000);
        boolean isTerrestrial = ui.readBoolean("This animal is terrestrial ");
        animal generateAnimal = new animal(species, legs, isTerrestrial);

        System.out.println(generateAnimal);

    }
}
