package util;

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
        userInt = scanner.nextInt();
        if (userInt > min && userInt < max) {
            return userInt;
        } else {
            getInt(min, max);
            return userInt;
        }
    }
    public static int getInt(int min, int max) {
        userInt = scanner.nextInt();
        if (userInt > min && userInt < max) {
            return userInt;
        } else {
            getInt(min, max);
            return userInt;
        }
    }

    public static int getInt () {
        System.out.println("Enter Number");
        userInt = scanner.nextInt();
        return userInt;
    }

    public static double  getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        System.out.println("Number with decimal please");
        userDouble = scanner.nextInt();
        if (userDouble > min && userDouble < max) {
            return userDouble;
        } else {
            getDouble(min, max);
            return userDouble;
        }
    }

    public static double  getDouble(double min, double max) {
        System.out.println("Number with decimal please");
        userDouble = scanner.nextInt();
        if (userDouble > min && userDouble < max) {
            return userDouble;
        } else {
            getDouble(min, max);
            return userDouble;
        }
    }

    public static Double getDouble() {
        return userDouble;
    }

}
