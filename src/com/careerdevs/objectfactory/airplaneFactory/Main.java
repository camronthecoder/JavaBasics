package com.careerdevs.objectfactory.airplaneFactory;

import com.careerdevs.objectfactory.UI;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<Airplane> hangar = new ArrayList<>();
        System.out.println("airplane factory\n\n");

        while (true){
            System.out.println("\nMenu\n" + "_".repeat(20));
            System.out.println("1) Create a Plane ");
            System.out.println("2) Show Hangar ");

            System.out.println("3) Exit the program");
            byte menuChoice = UI.readByte("CHOOSE AN OPTION", (byte) 1,(byte) 3);


            if(menuChoice == 3) break;
            else if (menuChoice==2){
                if (hangar.size()==0){
                    System.out.println("\n No airplanes in hangar LOL \n ");
                    continue;
                }

            } else{
                //show hangar
                System.out.println("AIRPLANE HANGAR");

                for (int i = 0; i < hangar.size(); i++) {
                    System.out.println(i + 1 + ")"+ hangar.get(i) + "\n");
                }
                System.out.println("-".repeat(20));
                continue;
            }
            //if the code gets to this option user create plane
            Airplane generatedAirplane = createAirplane();
            hangar.add(generatedAirplane);
            System.out.println("\n\n Created Airplane : \n" + generatedAirplane);
        }
        System.out.println("\n thank you for using the program");
    }

private static Airplane createAirplane () {
    String modelName = UI.readString("what is the model name ");
    String tailNumber = "AAA"; //("what ist the tail number?");
    short passengerCap = 100; //ui.readShort("what is the passenger cap?", (short) 0, (short) 300);
    int marketValue = 1_000_000_000; //ui.readInt("what is the market value?", 0, 100000000);
    double gasTank = .5; //ui.readDouble("what is the gas tank percentage?", 0, 1);
    boolean isFlying = false;  //ui.readBoolean("Is the plane flying?");
    return new Airplane(modelName, tailNumber, passengerCap,marketValue,gasTank,isFlying);
}
}