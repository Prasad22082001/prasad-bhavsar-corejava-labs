package com.vaman.lab1;

import java.util.Scanner;

public class Exercise6 {

    // Method to calculate difference
    public static int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        // Calculate both sums
        for (int i = 1; i <= n; i++) {
            sumOfSquares = sumOfSquares + (i * i); // 1² + 2² + ... + n²
            sum = sum + i;                         // 1 + 2 + ... + n
        }

        // Square of sum
        int squareOfSum = sum * sum;

        // Return difference
        return sumOfSquares - squareOfSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int result = calculateDifference(n);

        System.out.println("Difference = " + result);

        sc.close();
    }
}