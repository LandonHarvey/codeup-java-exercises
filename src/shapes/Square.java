package shapes;

public class Square extends Rectangle {
    protected int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getArea() {
        int area;
        return area = (int) Math.pow(side, 2);
    }

    @Override
    public int getPerimeter() {
        int perimeter;
        return perimeter = 4 * side;
    }
}
