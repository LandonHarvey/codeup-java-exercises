//        Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.
//        Write a method named secondChar() that takes a string as an input and returns the Second letter as a character data type.
//        Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.
//        Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.
//
//        Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".
//
//        Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
//
//        Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
//
//        Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
//
//        Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.
//
//        Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".
//
//        Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.
//
//        Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.
//
//        Write a solution to FizzBuzz using recursion instead of a loop.
//
//        Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.
//
//        Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.

import java.util.Scanner;
import java.lang.Math;

public class bonusExcer {

    public static char firstChar() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please Enter a word?");
        char character = scanner.next().charAt(0);
        System.out.println(character);
        return character;
    }
    public static char secondChar() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please Enter a word?");
        char character = scanner.next().charAt(1);
        System.out.println(character);
        return character;
    }
    public static char lastChar() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please Enter a word?");
        String word = scanner.next();
        char character = word.charAt(word.length()- 1);
        System.out.println(character);
        return character;
    }
    public static char secondToLastChar() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please Enter a word?");
        String word = scanner.next();
        char character = word.charAt(word.length()- 2);
        System.out.println(character);
        return character;
    }
    public static boolean userWantsToContinue() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please Enter a word?");
        String word = scanner.next();
        boolean cLoop = false;

        if (word.equals("y") || word.equals("yes")) {
            cLoop = true;
        }
        System.out.println(cLoop);
        return cLoop;
    }

    public static boolean isEven(int num) {
        boolean evenS = false;
        if (num % 2 == 0) {
            evenS = true;
        }
        return evenS;
    }
    public static boolean isOdd(int num) {
        boolean oddS = false;
        if (num % 2 == 1) {
            oddS = true;
        }
        return oddS;
    }
    public static int countOdd(int start, int end) {
        int numberOfOdds = 0;
        for (int i = start; i < end; i++) {
            if (isOdd(i)){
                numberOfOdds += 1;
            }
        }
        return numberOfOdds;
    }
    public static int countEven(int start, int end) {
        int numberOfOdds = 0;
        for (int i = start; i < end; i++) {
            if (isEven(i)){
                numberOfOdds += 1;
            }
        }
        return numberOfOdds;
    }

    public static boolean  isVowel (String userWord) {
        boolean vowel = false;
        if (userWord.equals("a") || userWord.equals("e") || userWord.equals("i")  || userWord.equals("o")  || userWord.equals("u")){
            vowel = true;
        }
        return vowel;
    }
    public static boolean hasVowels(String userWord) {
        boolean vowel = false;
        for (int i = 0; i < userWord.length(); i++){
           if(isVowel(userWord.substring(i,i+1))) {
               vowel = true;
           }
        }
        System.out.println(vowel);
        return  vowel;
    }
    public static int countVowels(String userWord) {
        int counter = 0;
        for (int i = 0; i < userWord.length(); i++){
            if(isVowel(userWord.substring(i,i+1))) {
                counter += 1;
            }
        }System.out.println(counter);
        return counter;
    }

    public static void fizzBuzz(int min, int max) {
        int counter = min;
        if (counter == max) {
            System.out.println("Done");
        } else if (counter % 3 == 0 && counter % 5 == 0) {
            System.out.println("FizzBuzz");
            counter++;
            fizzBuzz(counter, max);
        } else if (counter % 3 == 0) {
            System.out.println("Fizz");
            counter++;
            fizzBuzz(counter, max);
        }else if (counter % 5 == 0) {
            System.out.println("Buzz");
            counter++;
            fizzBuzz(counter, max);
        }else {
            System.out.println(counter);
            counter++;
            fizzBuzz(counter, max);
        }
    }

    public static boolean isPrime(int userNumber){
        int factors = 0;
        int j = 1;

        while(j <= userNumber)
        {
            if(userNumber % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }

    public static String getTwentyPrimes() {
        String primeList = "Output: \"";
        int numberTwenty = 0;
        for (int i = 1; i <= 150; i++){
            if (isPrime(i) && numberTwenty != 20){
                numberTwenty += 1;
                System.out.println(numberTwenty);
                primeList += i + ", ";
            }
        }
        primeList += "...\"";
        System.out.println(primeList);
        return primeList;
    }

    public static void main(String[] args) {
//        firstChar();
//        secondChar();
//        lastChar();
//        secondToLastChar();
//        userWantsToContinue();
//        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Please Enter a number?");
//        int userNumber = scanner.nextInt();
//        isEven(userNumber);
//        isOdd(userNumber);
//        countOdd(0, userNumber);
//        countEven(0, userNumber);
//        System.out.println("Please Enter a word?");
//        String userCharacter = scanner.nextLine();
//        isVowel(userCharacter);
//        hasVowels(userCharacter);
//        countVowels(userCharacter);
//        fizzBuzz(1, 100);
//        isPrime(8);
//        getTwentyPrimes();
        double a = .1;
        double b = .2;
        double c = (((a * 100) + (b * 100)) / 100);
        System.out.println(c);
    }
}
