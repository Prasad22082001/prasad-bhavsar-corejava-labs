package com.vaman.lab7.service;

import java.util.HashMap;
import java.util.Map;

import com.vaman.lab7.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    private HashMap<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public String getInsuranceScheme(double salary, String designation) {

        if (salary > 5000 && salary < 20000 &&
                designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        } else if (salary >= 20000 && salary < 40000 &&
                designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 40000 &&
                designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary < 5000 &&
                designation.equalsIgnoreCase("Clerk")) {
            return "No Scheme";
        }

        return "No Scheme";
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    @Override
    public void displayEmployeesByScheme(String scheme) {

        boolean found = false;

        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {

            Employee emp = entry.getValue();

            if (emp.getInsuranceScheme().equalsIgnoreCase(scheme)) {
                System.out.println(emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employee found.");
        }
    }

    @Override
    public void deleteEmployee(int id) {

        if (employeeMap.remove(id) != null) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}