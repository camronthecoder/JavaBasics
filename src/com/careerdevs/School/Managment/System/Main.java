package com.careerdevs.School.Managment.System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"lizzy", 500);
        Teacher melissa = new Teacher(2, "melissa", 700);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        //
        Student cameron = new Student(1, "Cameron", 4);
        Student mike = new Student(2,"mike",5);
        List<Student> studentList = new ArrayList<>();
        studentList.add(cameron);
        studentList.add(mike);



        School DMS = new School(teacherList,studentList);

        System.out.println("\n--------STUDENT FEES----------");

        cameron.payFees(10000);
        System.out.println("\n" + cameron);

        System.out.println("DMS has earned $ " + DMS.getTotalMoneyEarned() + " from student fees." );

        System.out.println("\n--------MAKING SCHOOL PAY SALARY----------");
        System.out.println("\n" + lizzy);
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("DMS has paid " + lizzy.getName() + " and now has: $ " + DMS.getTotalMoneyEarned() + ".");

    }
}
