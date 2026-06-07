package com.vaman.lab5;

public class EmployeeService {

    public void validateSalary(Employee emp) throws EmployeeException {

        if (emp.getSalary() < 3000) {
            throw new EmployeeException(
                    "Salary of employee " + emp.getName() +
                    " is below 3000.");
        }

        System.out.println("Employee salary is valid.");
    }
}
