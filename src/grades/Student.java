package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap <String, String> attendence;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendence = new HashMap<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }
    // returns the average of the students grades
    public int getGradeAverage(){
        int average = 0;
        for (Integer grade: grades) {
            average +=grade;
        }
        average /= grades.size();
        return average;
    }
    public String printGrades() {
        for (Integer grade: grades){
            System.out.format("%nGrade: %s",grade);
        }
        return "\n";
    }

    public void addAttendence(String date, String value){
        attendence.put(date, value);
    }

    public double attendencePerc() {
        double count = 0;
        double abs =0;
        double perc = 0;
        for (String atten: attendence.values()) {
            count += 1;
            if (atten.equals("a")) {
                abs += 1;
            }
        }
        perc = (count - abs)/count;
        perc = perc * 100;
        System.out.format("Attendance Percentage: %.0f%%%n", perc);
        return perc;
    }

    public void attendenceDates() {
        int count = 0;
        for (String atten: attendence.values()) {
            if (atten.equals("a")) {
                System.out.println("Date Absent "+attendence.keySet().toArray()[count]);
            }
            count++;
        }
    }

    public static double classAverage(HashMap <String , Student> students){
        double output = 0;
        int count = 0;
        for (Student student: students.values()){
            count++;
            output+= student.getGradeAverage();
        }
        output /= count;
        return output;
    }

    public static void main(String[] args) {
        Student doug = new Student("Bob");
        doug.addGrade(80);
        doug.addGrade(90);
        doug.getGradeAverage();
    }
}


