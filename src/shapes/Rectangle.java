package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        int area;
        return area = length * width;
    }

    public int getPerimeter () {
        int perimeter;
        return perimeter = 2 * length + 2 * width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
