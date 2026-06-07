package com.vaman.lab3;

import java.util.Scanner;

public class Exercise8 {

    static boolean isPositive(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.next();

        boolean result = isPositive(input);

        System.out.println(result);

        sc.close();
    }
}