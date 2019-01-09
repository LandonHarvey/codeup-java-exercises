import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Talk to Bob");
        String bobMessage;
        String yourMessage = scanner.next() + scanner.nextLine();
        int questions = yourMessage.indexOf("?");
        int yell = yourMessage.indexOf("!");
        int lengthM = yourMessage.length();

        if (questions > 0) {
            bobMessage = "'Sure.";
            System.out.println(bobMessage);
        } else if (yell > 0) {
            bobMessage = "Whoa, chill out!";
            System.out.println(bobMessage);

        }else if (lengthM == 0) {
            bobMessage = "Fine. Be that way!";
            System.out.println(bobMessage);

        } else {
            bobMessage = "Whatever.";
            System.out.println(bobMessage);
        }
    }
}
