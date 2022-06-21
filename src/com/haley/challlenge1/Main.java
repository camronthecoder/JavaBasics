package com.haley.challlenge1;

public class Main {
    public static void main(String[] args) {
         String firstName = "Cameron";
         String lastName = "Haley";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(createFullName("first", "last"));
    }
    private static String createFullName (String firstName, String lastName){
        return firstName + " " + lastName;
    }
}
