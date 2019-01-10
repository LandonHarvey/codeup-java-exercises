import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static int gameRandom () {
        Random rand = new Random();
        int gameNumber = rand.nextInt((100) + 1);
        return gameNumber;
    }

    public static int rightGuess (int gameNumber){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int userGuess;
        int numberOfGuess = 0;
        int guessPossible = 10;
        String guessesMade = "Your Guesses Are: ";
        do {
            System.out.println("You have " + (10 - numberOfGuess) + " guess's left!");
            userGuess = scanner.nextInt();
            numberOfGuess += 1;
            guessesMade += userGuess + " ";
            System.out.println(guessesMade);
            if (numberOfGuess == 10) {
                System.out.println("You Lose No More Guess's");
            } else if (userGuess < gameNumber) {
                System.out.println("HIGHER");
                System.out.printf("You have guessed: %d times %n",numberOfGuess);
            } else if (userGuess > gameNumber) {
                System.out.println("LOWER");
                System.out.printf("You have guessed: %d times %n",numberOfGuess);
            } else{
                System.out.println("Good Guess you Won!! With " + numberOfGuess + " Guess's");
                System.out.println("Game Number was: " + gameNumber);
            }
        }while (userGuess != gameNumber && numberOfGuess != guessPossible);
        return userGuess;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int gameNumber = gameRandom();
        System.out.println("Guess the Number: ");
        int userInput = rightGuess(gameNumber);
    }
}
