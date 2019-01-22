package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static String userString;
    static boolean userB;
    static int userInt;
    static double userDouble;

    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public static String getString(String prompt) {
        System.out.println(prompt);
        userString = scanner.next() + scanner.nextLine();
        return userString;
    }
    public static String getString() {
        System.out.println("String Please");
        userString = scanner.next() + scanner.nextLine();
        return userString;
    }

    public static boolean yesNo(String prompt){
        System.out.println(prompt);
        System.out.println("y/No");
        String userInput = scanner.next();
        if (userInput.equals("yes") || userInput.equals("y")) {
            return userB = true;
        }else {
            return userB = false;
        }
    }

    public static boolean yesNo() {
        System.out.println("y/No");
        String userInput = scanner.next();
        if (userInput.equals("yes") || userInput.equals("y")) {
            return userB = true;
        }else {
            return userB = false;
        }
    }

    public static int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        try {
            userInt = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("User did not type Integer!");
        }
        if (userInt > min && userInt < max) {
            return userInt;
        } else if (userInt < min && userInt > max) {
            getInt(min, max);
            return userInt;
        }else {
            System.out.println("Didn't type correct Number ");
            return userInt;
        }
    }
    public static int getInt(int min, int max) {
        System.out.println("Type Input: ");
        try {
            userInt = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("User did not type Integer!");
        }

        if (userInt > min && userInt < max) {
            return userInt;
        } else if (userInt < min && userInt > max) {
            getInt(min, max);
            return userInt;
        }else {
            System.out.println("Didn't type correct Number");
            return userInt;
        }
    }

    public static int getInt () {
        System.out.println("Enter Number");
        try {
            userInt = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("User did not type Integer!");
        }
        return userInt;
    }

    public static double  getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        System.out.println("Number with decimal please");
        try {
        userDouble = scanner.nextDouble();
        } catch (InputMismatchException ex){
            System.out.println("User did not type Number with decimals");
        }
        if (userDouble > min && userDouble < max) {
            return userDouble;
        } else if (userDouble < min && userDouble > max){
            getDouble(min, max);
            return userDouble;
        }else {
            return userDouble;
        }
    }

    public static double  getDouble(double min, double max) {
        System.out.println("Number with decimal please");
        try {
            userDouble = scanner.nextDouble();
        } catch (InputMismatchException ex){
            System.out.println("User did not type Number with decimals");
        }
        if (userDouble > min && userDouble < max) {
            return userDouble;
        } else if (userDouble < min && userDouble > max){
            getDouble(min, max);
            return userDouble;
        }else {
            System.out.println("Wrong");
            return userDouble;
        }
    }

    public static Double getDouble() {
        System.out.println("Number with decimal please");
        userDouble = scanner.nextDouble();
        return userDouble;
    }

    public static Integer getBinary(String s) {
        int numberConv = 0;
        try {
        numberConv = Integer.parseInt(s,2);
        System.out.println(numberConv);
        return numberConv;
        } catch (NumberFormatException ex) {
            System.out.println("Number not a number or String Number!");
        }
        return numberConv;
    }

    public static Integer getHex(String s) {
        int numberConv = 0;
        try{
            numberConv = Integer.parseInt(s, 16);
            System.out.println(numberConv);
            return numberConv;
        } catch (NumberFormatException ex) {
            System.out.println("Number not a number or String!");
        }
        return numberConv;
    }
}
