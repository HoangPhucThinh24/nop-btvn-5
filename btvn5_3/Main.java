package btvn5_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so luong nguoi");
        int n = Integer.parseInt(scanner.nextLine());
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("nhap id");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap ten");
            String name = scanner.nextLine();
            System.out.println("nhap tuoi");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("nhap so nam kinh nghiem");
            double exp = Double.parseDouble(scanner.nextLine());
            btvn5_3.Employee employee = new btvn5_3.Employee(id, name, age, exp);
            employees[i] = employee;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(employees[i]);
        }




    }
}
