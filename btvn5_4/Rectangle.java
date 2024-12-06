package btvn5_4;

public class Rectangle extends ShapeService {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void displayDimensions() {
        System.out.println("chieu dai hcn: " + length + ", chieu rong hcn: " + width);
    }
}
