package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Emp> employeeList = new ArrayList<>();

        while (true) {
            System.out.println("Please select a menu option:");
            System.out.println("1. Accept employee details");
            System.out.println("2. Display top 3 earners");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter employee name:");
                    String name = scanner.next();

                    System.out.println("Enter employee designation:");
                    String designation = scanner.next();

                    System.out.println("Enter employee salary:");
                    double salary = scanner.nextDouble();

                    Emp employee = new Emp(name, designation,salary);
                    employeeList.add(employee);

                    System.out.println("Employee details added successfully!");
                    break;

                case 2:
                    Collections.sort(employeeList, Comparator.comparingDouble(Emp::getSalary).reversed());

                    System.out.println("Top 3 earners:");

                    for (int i = 0; i < 3 && i < employeeList.size(); i++) {
                        System.out.println((i + 1) + ". " + employeeList.get(i).getName() + " - $" + employeeList.get(i).getSalary());
                    }

                    break;

                case 3:
                    System.out.println("Exiting employee management system...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
class Emp {
    private String name;
    private String designation;
    private double salary;

    public Emp(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getdesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
}
