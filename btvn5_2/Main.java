package btvn5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("nhap dia chi");
        String address = scanner.nextLine();
        System.out.println("nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so nam kn");
        double exp = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap noi lam viec");
        String place = scanner.nextLine();
        Employee employee = new Employee(id, name, address, age, place, exp);
        System.out.println(employee);
    }
}
