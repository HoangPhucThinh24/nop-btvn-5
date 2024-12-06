package btvn5_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap name");
        String name = scanner.nextLine();
        System.out.println("Nhap price");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        System.out.println(product);
        System.out.println("thue sp la: "+product.vat());
    }
}
