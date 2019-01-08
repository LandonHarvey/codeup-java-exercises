import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What grade did you receive?");
        int userGrade = scanner.nextInt();
        System.out.println("Grade Ranges:");
        System.out.println("A : 100 - 88\n" + "B : 87 - 80\n" + "C : 79 - 67\n" + "D : 66 - 60\n" + "F : 59 - 0");
        System.out.println();
        System.out.println("Do you agree with Grade Range? y/N");
        String choice = scanner.next();
        if (choice.equals("y")) {
            if(userGrade <= 59) {
                System.out.println("F");
            }else if (userGrade <= 66){
                System.out.println("D");
            }else if (userGrade <= 75){
                System.out.println("C");
            }else if (userGrade <= 79){
                System.out.println("C+");
            }else if (userGrade <= 84){
                System.out.println("B");
            }else if (userGrade <= 87){
                System.out.println("B+");
            }else if (userGrade <= 95){
                System.out.println("A");
            }else if (userGrade <= 100){
                System.out.println("A+");
            }
        } else {
            System.out.println("You get an automatic F for not complying Muahaha");
        }
    }
}


