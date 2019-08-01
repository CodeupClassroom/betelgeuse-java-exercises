package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        System.out.println("**In Rectangle.getArea()**");
        return this.length * this.width;
    }

    public double getPerimeter() {
        System.out.println("**In Rectangle.getPerimeter()**");
        return (2 * (this.length + this.width));
    }
}
