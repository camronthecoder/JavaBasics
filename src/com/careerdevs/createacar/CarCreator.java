package com.careerdevs.createacar;
import com.careerdevs.carproject.Car;
import java.util.Scanner;

public class CarCreator {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("hello welcome to the car creator");

        System.out.println("What is the car make?");

        String userInputMake = scanner.nextLine();

        System.out.println("What is the car model?");

        String userInputModel = scanner.nextLine();

        Car userCar = new Car(userInputMake,userInputModel, 0 , 0 ,0);

        System.out.println(userCar);

    }
}

