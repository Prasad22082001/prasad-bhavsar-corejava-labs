package com.vaman.lab5;

import java.util.Scanner;



public class Exercise3{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            EmployeeService service = new EmployeeService();
            service.validateSalary(emp);

        } catch (EmployeeException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}