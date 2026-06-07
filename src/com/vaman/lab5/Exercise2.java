package com.vaman.lab5;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        try {
            if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
                throw new NameException("First Name and Last Name cannot be blank");
            }

            System.out.println("Employee Name: " + firstName + " " + lastName);

        } catch (NameException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
