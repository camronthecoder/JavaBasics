package com.careerdevs.School.Managment.System;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    public Teacher(int id, String name, int salary) {
        //initialize fields as unique so set them to each other
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned =0;
    }
    //return the id of the tacher
    public int getID(){
        return id;
    }
    //return the name of the teacher
    public String getName(){
        return this.name;
    }

    //return the salary of the teacher
    public int getSalary(){
        return salary;
    }

    //create setters for the fields that will be changed
    //set the salary
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void receiveSalary(int salary){
        salaryEarned +=salary;
        School.updateTotalMoneySpent(salary);

    }
    @Override
    public String toString() {
        return "Teacher: "+ name + ". Salary paid: $ " + getSalary();
    }
}
