package btvn5_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chieu dai hcn");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap chieu rong hcn");
        int b = Integer.parseInt(scanner.nextLine());

        Rectangle rectangle = new Rectangle(a,b);

        System.out.println("nhap canh hinh vuong");
        int c = Integer.parseInt(scanner.nextLine());
        Square square = new Square(c);

        rectangle.displayDimensions();
        System.out.println("Chu vi hcn: " + rectangle.calculateArea());
        System.out.println("Dien tich hcn: " + rectangle.calculatePerimeter());

        square.displayDimensions();
        System.out.println("Chu vi hinh vuong: " + square.calculateArea());
        System.out.println("Dien tich hinh vuong: " + square.calculatePerimeter());

    }
}
