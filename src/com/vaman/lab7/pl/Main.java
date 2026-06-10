package com.vaman.lab7.pl;

import java.util.Scanner;

import com.vaman.lab7.bean.Employee;
import com.vaman.lab7.service.EmployeeService;
import com.vaman.lab7.service.EmployeeServiceImpl;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeService service = new EmployeeServiceImpl();

        while (true) {

            System.out.println("\n===== Employee Insurance System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees By Scheme");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                sc.nextLine();

                System.out.print("Enter Designation: ");
                String designation = sc.nextLine();

                String scheme =
                        service.getInsuranceScheme(salary, designation);

                Employee emp =
                        new Employee(id, name, salary,
                                     designation, scheme);

                service.addEmployee(emp);

                System.out.println("Employee Added Successfully");
                System.out.println("Insurance Scheme: " + scheme);

                break;

            case 2:

                sc.nextLine();

                System.out.print("Enter Scheme (Scheme A/B/C): ");
                String sch = sc.nextLine();

                service.displayEmployeesByScheme(sch);

                break;

            case 3:

                System.out.print("Enter Employee ID to Delete: ");
                int deleteId = sc.nextInt();

                service.deleteEmployee(deleteId);

                break;

            case 4:

                System.out.println("Thank You");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}