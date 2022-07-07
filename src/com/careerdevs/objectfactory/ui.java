package com.careerdevs.objectfactory;

import java.util.Scanner;

public class ui {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readString(String question) {
        while (true) {
            System.out.println(question + "\nInput: ");
            String input = scanner.nextLine();
            if (!input.trim().equals("")) {
                return input;
            }
        }
    }

    public static boolean readBoolean(String question) {
        while (true) {
            try {
                System.out.print(question + "\n(true/false):");
                boolean input = scanner.nextBoolean();
                scanner.nextLine();
                return input;
            } catch (Exception exception) {
                System.out.println("input must be true or false");
                scanner.nextLine();
            }
        }
    }
    public static int readInt(String question, int min, int max ){
        while (true) {
        try {
            System.out.print(question + "\n("+min+" - " +max+ "):");
            int input = scanner.nextInt();
            scanner.nextLine();
            return input;
        } catch (Exception exception) {
            System.out.println("input must be between" + min +  "and" +  max);
            scanner.nextLine();
        }
    }
    }

    public static short readShort(String question, short min, short max ) {
        while (true) {
            try {
                System.out.print(question + "\n(" + min + "- " + max + "):");
                short input = scanner.nextShort();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("input must be between" + min + "and" + max);
                }
            } catch (Exception exception) {
                System.out.println("input must be between" + min + "and" + max);
                scanner.nextLine();

            }
        }
    }
    public static double readDouble(String question, double min, double max ){
        while (true) {
            try {
                System.out.print(question + "\n("+min+" - "+ max+ "):");
                double input = scanner.nextShort();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println("input must be between" + min + "and" + max);
                }
            } catch (Exception exception) {
                System.out.println("input must be between" + min +  "and" +  max);
                scanner.nextLine();
            }
        }
    }
}