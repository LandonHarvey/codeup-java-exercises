package movies;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - view movies in the musical category");
            int userAnswer = Input.getInt(0, 6, "Enter Your Choice: ");

            if (userAnswer == 1) {
                MoviesArray.findAll();
            } else if (userAnswer == 2) {
                MoviesArray.sortedCategory("animated");
            } else if (userAnswer == 3) {
                MoviesArray.sortedCategory("drama");
            } else if (userAnswer == 4) {
                MoviesArray.sortedCategory("horror");
            } else if (userAnswer == 5) {
                MoviesArray.sortedCategory("scifi");
            } else if (userAnswer == 6) {
                MoviesArray.sortedCategory("musical");
            } else if (userAnswer == 0) {
                System.out.println("Ending");
            } else {
                System.out.println("nah");
            }
        }while (Input.yesNo("Want to continue?"));
    }
}
