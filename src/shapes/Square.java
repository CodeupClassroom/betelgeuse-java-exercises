package shapes;

public class Square extends Rectangle{
//    protected double side;

    public Square(double side) {
        super(side,side);
//        this.side = side;
    }

    public double getPerimeter() {
        System.out.println("**In Square.getPerimeter()**");
        return 4 * this.width;
    }

    public double getArea() {
        System.out.println("**In Square.getArea()**");
        return this.width * this.width;
    }

}
