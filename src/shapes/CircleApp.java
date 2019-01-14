package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        double userInt = Input.getInt();
        Circle circle1 = new Circle(userInt);
        circle1.getArea();
        circle1.getCircumference();
        System.out.println("Would you like to make another circle? y/No");
        Input.yesNo();
        System.out.println(Circle.getNumberOfCircles());
    }
}
