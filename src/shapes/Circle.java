package shapes;

public class Circle {
    private double radius;
    double circumference;
    double area;
    private static int numberOfCircles;

    public Circle(double radius) {
        numberOfCircles++;
        this.radius = radius;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    public double getArea() {
        area = Math.PI * (Math.pow(radius, 2));
        System.out.println("Area of circle is: " + area);
        return area;
    }
    public double getCircumference() {
        circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle is: " + circumference);
        return circumference;
    }
}
