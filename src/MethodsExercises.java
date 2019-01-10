import java.util.Scanner;

public class MethodsExercises {
    public static double add(double n, double m) {
        return n + m;
    }
    public static double sub(double n, double m) {
        return n -m;
    }
    public static double mult(double n, double m) {
        return n * m;
    }
    public static double div(double n, double m) {
            return n/m;
    }
    public static double mod(double n, double m) {
        return n%m;
    }
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int input = scanner.nextInt();
        if (input > max || input < min) {
            System.out.print("Enter a number between 1 and 10: ");
            return getInteger(1, 10);
        }return input;
    }

    public static long calcFactorial (int facInput) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println(facInput + "!");
        System.out.println("Continue? : y/N");
        String keepGoing = scanner.next();
        while (keepGoing.equals("y")) {
            long res = 1;
            long i;
            for (i = 2; i <= facInput; i++)
                res = res * i;
            System.out.println(facInput + "! = " + res);
            return res;
        }return facInput;
    }

    public static void diceRoll (int diceFaces) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int random = 1;
        boolean keepGoing = true;
        do {
            int die1 = (int)(Math.random() * diceFaces + 1);
            int die2 = (int)(Math.random() * diceFaces + 1);
            System.out.println("Your Rolls: " + die1 + " " + die2);
            System.out.println("Continue? : y/N");
            String stoppers = scanner.next();
            if (stoppers.equals("N")) {
                keepGoing = false;
            }
        } while(keepGoing);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        add(1, 2);
        sub(1, 2);
        mult(1, 2);
        div(2, 0);
        mod(1, 2);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.print("Enter a number between 1 and 19: ");
        int facInput = getInteger(1, 19);
        calcFactorial(facInput);

        System.out.print("How many sides are on your Die?");
        int dieSides = scanner.nextInt();
        diceRoll(dieSides);
    }
}
