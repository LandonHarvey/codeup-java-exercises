package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setLength() {
        this.length = length;
    }

    @Override
    public void setWidth() {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return Math.pow(length, 2);
    }

    @Override
    public double getArea() {
        return 4*length;
    }

//    protected int side;
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public int getArea() {
//        int area;
//        return area = (int) Math.pow(side, 2);
//    }
//
//    @Override
//    public int getPerimeter() {
//        int perimeter;
//        return perimeter = 4 * side;
//    }
}
