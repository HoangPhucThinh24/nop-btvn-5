package btvn5_4;

public class Square extends ShapeService {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    // Ghi đè phương thức tính chu vi
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    // Hiển thị thông tin
    @Override
    public void displayDimensions() {
        System.out.println("canh hinh vuong: " + side);
    }
}
