package com.careerdevs.basicio;

import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        whatIsYourName();

    }
    private static void whatIsYourName (){
        System.out.println("What is your first Name?");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        System.out.println ("How many dogs do you have?");
        int dogNumber = scanner.nextInt();
        String fullName = (firstName+ " " + lastName);
        System.out.println("Your name is " + fullName + " and you have " + dogNumber + " dogs.");


    }
}
