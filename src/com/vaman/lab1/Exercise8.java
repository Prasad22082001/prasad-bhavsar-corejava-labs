package com.vaman.lab1;

import java.util.Scanner;

public class Exercise8 {

    // Method to check if number is power of 2
    public static boolean checkNumber(int n) {

        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = checkNumber(n);

        if (result) {
            System.out.println("It is a power of 2");
        } else {
            System.out.println("It is NOT a power of 2");
        }

        sc.close();
    }
}