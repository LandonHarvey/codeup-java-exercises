package grades;

import util.Input;

import java.util.Collections;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap <String, Student> students = new HashMap<>();
        Student doug = new Student("Doug");
        doug.addGrade(80);
        doug.addGrade(60);
        doug.addGrade(20);
        doug.addAttendence("2017-10-02", "a");
        doug.addAttendence("2017-10-03", "a");
        doug.addAttendence("2017-10-04", "p");
        Student bob = new Student("Bob");
        bob.addGrade(90);
        bob.addGrade(97);
        bob.addGrade(100);
        bob.addAttendence("2017-10-02", "a");
        bob.addAttendence("2017-10-03", "a");
        bob.addAttendence("2017-10-04", "a");
        Student larry = new Student("Larry");
        larry.addGrade(45);
        larry.addGrade(55);
        larry.addGrade(65);
        larry.addAttendence("2017-10-02", "p");
        larry.addAttendence("2017-10-03", "a");
        larry.addAttendence("2017-10-04", "p");
        Student john = new Student("John");
        john.addGrade(90);
        john.addGrade(90);
        john.addGrade(90);
        john.addGrade(90);
        john.addAttendence("2017-10-02", "a");
        john.addAttendence("2017-10-03", "p");
        john.addAttendence("2017-10-04", "p");

        students.put("Bob1", bob);
        students.put("Doug1", doug);
        students.put("Larry1", larry);
        students.put("John1", john);
        System.out.format("Welcome! %nClass Grade Average: %.0f%%%nHere are the github usernames of our students:%n",Student.classAverage(students));
        Boolean userDecision = false;
        do {
            for (String username : students.keySet()) {
                System.out.format("| %s | ", username);
            }
            String userInput = Input.getString("\n" + "What student would you like to see more information on?");
            boolean worked = false;
            for (String username : students.keySet()) {
                if (userInput.equals(username)) {
                    worked = true;
                    System.out.format("Name: %s - Github Username: %s%nCurrent Average: %d", students.get(username).getName(), username, students.get(username).getGradeAverage());
                    System.out.printf("%s", students.get(username).printGrades());
                    students.get(username).attendencePerc();
                    students.get(username).attendenceDates();
                    userDecision = Input.yesNo("Would you like to continue? y/No");
                }
            }
            if (!worked) {
                System.out.format("Sorry, no student found with the github username of: %s", userInput);
                userDecision = Input.yesNo("Would you like to continue? y/No");
            }
        }while (userDecision);
    }
}
