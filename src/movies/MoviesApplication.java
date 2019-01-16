package movies;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import util.Input;

public class MoviesApplication {

    private static Movie [] allMovies = MoviesArray.findAll();

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
            System.out.println("7 - create a movie");
            int userAnswer = Input.getInt(-1, 8, "Enter Your Choice: ");

            if (userAnswer == 1) {
                MoviesArray.findAll();
            } else if (userAnswer == 2) {
                sortedCategory("animated");
            } else if (userAnswer == 3) {
                sortedCategory("drama");
            } else if (userAnswer == 4) {
               sortedCategory("horror");
            } else if (userAnswer == 5) {
                sortedCategory("scifi");
            } else if (userAnswer == 6) {
               sortedCategory("musical");
            }else if (userAnswer == 7) {
                String userName = Input.getString("Please tell the name of the movie: ");
                String userCategory = Input.getString("Please tell teh category of the movie: ");
               Movie userMovie = new Movie(userName, userCategory);
               addMovie(userMovie);
            } else if (userAnswer == 0) {
                System.out.println("Ending");
            } else {
                System.out.println("nah");
            }

        }while (Input.yesNo("Want to continue?"));

    }

    public static Movie[] sortedCategory (String category){

        Movie[] sortedMovies = new Movie[allMovies.length];
        for (int i = 0; i < allMovies.length; i++){
            if (allMovies[i].getCategory().equals(category)){
                sortedMovies[i] = allMovies[i];
            }
        }
        String output = "";
        for (Movie movie: sortedMovies) {
            if (movie != null){
                System.out.format("Movie: %s%nCategory: %s%n%n", movie.getName(), movie.getCategory());
            }
        }
        return sortedMovies;
    }

    public static void addMovie(Movie userMovie) {
        allMovies = Arrays.copyOf(allMovies, allMovies.length + 1);
        allMovies[allMovies.length - 1] = userMovie;
    }
}
