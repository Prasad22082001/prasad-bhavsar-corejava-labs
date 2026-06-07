package com.vaman.lab1;

import java.util.Scanner;

public class Exercise7 {

    // Method to check increasing number
    public static boolean checkNumber(int number) {

        int lastDigit = number % 10;
        number = number / 10;

        while (number > 0) {
            int currentDigit = number % 10;

            if (currentDigit > lastDigit) {
                return false; // not increasing
            }

            lastDigit = currentDigit;
            number = number / 10;
        }

        return true; // increasing number
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (checkNumber(number)) {
            System.out.println("It is an increasing number");
        } else {
            System.out.println("It is NOT an increasing number");
        }

        sc.close();
    }
}