package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    whatIsYourName();
    whatIsYourFullName();
    }
    public static void whatIsYourName() {
        System.out.println("What is your name ?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Hello " + userInput );
    }
    public static void whatIsYourFullName(){
        System.out.println("what is your first name?");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("What is your last name ?");
        Scanner LastScanner = new Scanner(System.in);
        String lastName = LastScanner.nextLine();
        System.out.println("full name: " + firstName + " " + lastName);
    }
}