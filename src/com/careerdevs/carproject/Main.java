package com.careerdevs.carproject;

public class Main {

    public static void main(String[] args) {

        Car car1 =  new Car("Audi", "Q8",  190, 16, 0.5f );
        Car car2 =  new Car("Ferrari", "La Ferrari",  231, 12, 0.2f );
        Car car3 =  new Car("Ford", "Mustang",  175, 14, 0.9f );

        
        Car[] carsArray = {car1, car2, car3};
        for (int i = 0; i < carsArray.length ; i++) {
           System.out.println(carsArray[i]);
        }

    }
}