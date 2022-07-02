package com.careerdevs.carfactory;

import java.util.Scanner;


//create class with variables that you will need
public class car {
    String name = " ";
    String make = " ";
    String model = " ";
    int speed = 0;
    int mileage = 0;
    float gasTankPercent = 0;

//main method
    public static void main(String[] args) {
        car newCar = new car();
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String nameScan = scan.nextLine();
        newCar.setName(nameScan);

        System.out.println("What is the car make?");
        String makeScan = scan.nextLine();
        newCar.setMake(makeScan);

        System.out.println("What is the car model?");
        String modelScan = scan.nextLine();
        newCar.setModel(modelScan);

        System.out.println("What is the car's top speed");
        int speedScan = scan.nextInt();
        newCar.setSpeed(speedScan);

        System.out.println("How many miles does the car have?");
        int mileScan = scan.nextInt();
        newCar.setMileage(mileScan);

        System.out.println("What is the gas tank percentage?");
        float gasTankScan = scan.nextFloat();
        newCar.setGasTankPercent(gasTankScan);

        newCar.createACar();
    }

//setters
        public void setName(String name){
            this.name = name;}

        public void setMake(String make){
            this.make = make;}

        public void setModel(String model){
            this.model = model;}

        public void setSpeed( int speed){
            this.speed = speed;}

        public void setMileage( int mileage){
            this.mileage = mileage;}

        public void setGasTankPercent(float gasTankPercent){
            this.gasTankPercent = gasTankPercent;}

//getters
        public String getName(){
            return this.name;}

        public String getMake(){
            return this.make;}

        public String getModel(){
            return this.model;}

        public int getSpeed(){
            return this.speed;}

        public int getMileage(){
            return this.mileage;}

        public float getGasTankPercent(){
            return this.gasTankPercent;}

//create a car by giving car class the getter data
public void createACar (){
    System.out.println(getName() + "'s " + getMake() + " " + getModel() + " has " + getMileage() + " miles on it. The top speed of the car is " + getSpeed() + "mph and it has a " + getGasTankPercent()+ "% full gas tank.");
}
}