package com.haley.challlenge1;

public class Main {
    public static void main(String[] args) {
         String firstName = "Cameron";
         String lastName = "Haley";

        String fullName = firstName + " " + lastName;
        nameGenerator nameGen = new nameGenerator()();

         String generatedFullName = new nameGenerator().generateFullName("cameron","haley");



        System.out.println(fullName);
        System.out.println(createFullName("first", "last"));
        System.out.println(generatedFullName);
    }
    private static String createFullName (String firstName, String lastName){
        return firstName + " " + lastName;
    }
}
