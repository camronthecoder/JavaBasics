package com.careerdevs.objectfactory.sanwhichFactory;

import com.careerdevs.objectfactory.UI;
import com.careerdevs.objectfactory.airplaneFactory.Airplane;

import java.util.ArrayList;

public class sandwichMain {
    public static void main(String[] args) {
        ArrayList<sandwich> sandWichList = new ArrayList<>();
        System.out.println("sandwich factory\n\n");

        while(true){
            System.out.println("\nMenu\n" + "_".repeat(20));
            System.out.println("1) Create A sandwich\n");
            System.out.println("2) View Order");
            System.out.println("3) Exit the program");

            byte menuChoice = UI.readByte("Choose An option",(byte)1, (byte)3);
            if (menuChoice ==3 ) break;
            else if (menuChoice == 2) {
                if (sandWichList.size()==0){
                    System.out.println("There are no sandwiches currently in the order :(");
                    continue;
                }}
                else {
                    System.out.println("Current Order");
                    for (int i = 0; i < sandWichList.size(); i++) {
                        System.out.println(i + 1 + ")"+ sandWichList.get(i) + "\n");}
                    System.out.println("-".repeat(20));
                    continue;
                    }
                    sandwich generatedSandwich = createSandwich();
                    sandWichList.add(generatedSandwich);
                    System.out.println("\n\n Created Sanwich : \n" + generatedSandwich);
                }
                System.out.println("\n thank you for using the program");
            }
        private static sandwich createSandwich() {
        int sandwichSize = UI.readInt("What is the size of the sandwich in inches ?",0, 12);
        String breadType = UI.readString("What type of bread would you like?");
        String meatType = UI.readString("What type of meat?");
        String cheeseType = UI.readString("What type of cheese?");
        boolean cutType= UI.readBoolean("You want this sandwich cut in half. ");
        return new sandwich(sandwichSize,breadType,meatType,cheeseType,cutType);
    }}