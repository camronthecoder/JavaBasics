package com.careerdevs.carfactory;

import java.util.Scanner;

public class Carcreator {
//getters

            private String make;
            private String model;
            private int speed;
            private  int mileage;
            private float gasTankPercent;

            Scanner scan = new Scanner(System.in);

            public Carcreator(String make, String model, int speed, int mileage, float gasTankPercent) {
                this.make = make;
                this.model= model;
                this.speed = speed;
                this.mileage = mileage;
                this.gasTankPercent = gasTankPercent;
            }

            //getters
            public String getMake() {
                return make;}

            public String getModel() {
                return model;}

            public int getSpeed(){
                return speed;}

            public int getMileage(){
                return mileage;}

            public float getGasTankPercent(){
                return  gasTankPercent;}

            //setters
            public void setMake (String make){
                make = scan.nextLine();
                this.make = make;
            }

            public void setModel (String model){
                this.model= model;}

            public void setSpeed (int speed){
                this.speed= speed ;}

            public void setMileage (int mileage){
                this.mileage=mileage;}

            public void setGasTankPercent (float gasTankPercent){
                this.gasTankPercent= gasTankPercent;
            }

            public String makeCarString(){
                return make + model + speed + mileage + gasTankPercent;
            }
}

