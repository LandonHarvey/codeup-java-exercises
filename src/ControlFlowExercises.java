import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to? ");
        int userNumber = scanner.nextInt();
        System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
        System.out.println("------" + "  " + "-------" + "  " + "-----");
        for (int i = 0; i <= userNumber; i++) {
            int numberSquared = (int) Math.pow(i, 2);
            int numberCubed = (int) Math.pow(i, 3);
            String message = "\n" + i + "       " + numberSquared + "        " + numberCubed;
            System.out.print(message);
        }
        System.out.println();
        System.out.println("Continue? y/N");
        String choice = scanner.next();
        if (choice.equals("y")) {
            System.out.println("Done");
        } else {
            System.out.println("Sorry Nothing else to do still ending Muhahahaha!!!");
        }
    }
}


