package com.careerdevs.School.Managment.System;
//responsible for keeping track of student data

//create student class
public class Student {

    //declare fields inside the class
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


//create a new student with constructor
    public Student(int id, String name, int grade){

    //initialize fields in the constructor

        //fees paid and initial fees are the same for all students
        this.feesPaid=0;
        this.feesTotal = 30000;

        //id name and grade are all unique set them to themselves
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
//create setters for the fields that will be changed

    //adding to the grade
    public void setGrade(int grade){
        this.grade = grade;
    }

    //add the fees to the fees already paid
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

//getters for when we want to return the fieleds
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;

    }

    @Override
    public String toString() {
        return "Student: "+ name + ". Fees paid: $ " + feesPaid;
    }
}

