package com.vaman.lab5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age <= 15) {
                throw new AgeException("Age must be above 15");
            }
            System.out.println("Valid age");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}