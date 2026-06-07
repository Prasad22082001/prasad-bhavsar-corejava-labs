package com.vaman.lab1;

import java.util.Scanner;

public class Exercise3 {

    static int fibonacci(int n) {
        if (n <= 2)
            return 1;

        int a = 1, b = 1;

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the position (n) to find Fibonacci value:");
        int n = sc.nextInt();

        System.out.println("Fibonacci value: " + fibonacci(n));

        sc.close();
    }
}