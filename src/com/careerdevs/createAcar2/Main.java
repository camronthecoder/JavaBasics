package com.careerdevs.createAcar2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     // createACarA();
      createACarB();
    }
    private static void createACarA(){
        Scanner scanner =new Scanner(System.in);

        System.out.println("hello welcome to the car creator");

        System.out.println("What is the car make?");

        String userInputMake = scanner.nextLine();

        System.out.println("What is the car model?");

        String userInputModel = scanner.nextLine();

        System.out.println("What is your name ");

        String userName = scanner.nextLine();

        System.out.println(userName + " owns a " + userInputMake + " " + userInputModel);


    }
    private static void createACarB(){
        Scanner scanner =new Scanner(System.in);

        System.out.println("hello welcome to the car creator");

        System.out.println("What is the car make?");

        String userInputMake = scanner.nextLine();

        System.out.println("What is the car model?");

        String userInputModel = scanner.nextLine();

        System.out.println("What is your name ");

        String userName = scanner.nextLine();

        System.out.println("What is the mieleage of the car ");

        int mileage = scanner.nextInt();

        System.out.println("What is the gas tank percentage  ");

        int gasTankPercentage = scanner.nextInt();

        System.out.println(userName + " owns a " + userInputMake + " " + userInputModel + ". The car has " + mileage +" miles " + "and has "  + gasTankPercentage + " percent of its gas tank full." );

    }


}


