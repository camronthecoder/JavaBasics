package com.careerdevs.objectfactory.SandwhichFactory;

import com.careerdevs.objectfactory.UI;

import java.util.ArrayList;

public class sandwichMain {
    public static void main(String[] args) {
        ArrayList<sandwich> sandwichList = new ArrayList<>();
        System.out.println("\n Welcome to the Sandwich Factory!\n" + "-".repeat(40));

        while(true){
            System.out.println( " ".repeat(10) +"Main Menu" + " ".repeat(10));
            System.out.println("1) Create A sandwich");
            System.out.println("2) View Order");
            System.out.println("3) Exit the program");

            //create button options
            byte menuChoice = UI.readByte("Choose An option",(byte)1, (byte)3);
            int sandwichPrice = 5;
            int orderTotal = (sandwichList.size() *5);

            //button selection
            if (menuChoice ==3 ) break;
            else if (menuChoice == 2) {
                if (sandwichList.size()==0){
                    System.out.println("-".repeat(20));

                    System.out.println("There are no sandwiches currently in the order :(");
                    System.out.println("Order total: $" + orderTotal);
                    System.out.println("-".repeat(20));
                    continue;
                }
                System.out.println("-".repeat(20));

                    System.out.println("Current Order");
                    for (int i = 0; i < sandwichList.size(); i++) {
                        System.out.println("Sandwich " + (i + 1) + ")"+ sandwichList.get(i) + "\nSandwich Price : $ " +  sandwichPrice +"\n");
                    }
                System.out.println( "Order Total: $ " + orderTotal );

                System.out.println("-".repeat(20));

                    }else{
            //option 1
            sandwich generatedSandwich = createSandwich();
            sandwichList.add(generatedSandwich);
                System.out.println("-".repeat(20));
                System.out.println("Created Sandwich : " + generatedSandwich + "\nSandwich Price : $ " + sandwichPrice);
            System.out.println("-".repeat(20));

            }}
                System.out.println("\nThank you for using the Sandwich Factory");
            }
        private static sandwich createSandwich() {
            System.out.println("-".repeat(20));

            int sandwichSize = UI.readInt("What is the size of the sandwich in inches ?",0, 12);
        String breadType = UI.readString("What type of bread would you like?");
        String meatType = UI.readString("What type of meat?");
        String cheeseType = UI.readString("What type of cheese?");
        boolean cutType= UI.readBoolean("You want this sandwich cut in half. ");
        return new sandwich(sandwichSize,breadType,meatType,cheeseType,cutType);
    }}