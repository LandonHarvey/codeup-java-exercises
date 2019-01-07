import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The Value of pi is approximately %s.\n", pi);
        Scanner scanner = new Scanner(System.in);
        int numberChosen = scanner.nextInt();
        System.out.println(numberChosen);

        System.out.println("Please enter 3 words");
        System.out.println("First Word: ");
        String firstWord = scanner.next();
        System.out.println("Second Word: ");
        String secondWord = scanner.next();
        System.out.println("Third Word: ");
        String thirdWord = scanner.next();
        System.out.format("Your Words are: \n%s\n%s\n%s\n", firstWord, secondWord, thirdWord);

        System.out.println("Enter a sentence");
        String userSentence = scanner.next() + scanner.nextLine();
        System.out.println(userSentence);

        System.out.println("Enter the length and width of the classroom: ");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        System.out.println("Area of the classroom = " + (length * width));
        System.out.println("Parameter of the classroom = " + ((length + width) * 2));

    }
}

