package com.vaman.lab7.service;

import com.vaman.lab7.bean.Employee;

public interface EmployeeService {

    String getInsuranceScheme(double salary, String designation);

    void addEmployee(Employee employee);

    void displayEmployeesByScheme(String scheme);

    void deleteEmployee(int id);
}