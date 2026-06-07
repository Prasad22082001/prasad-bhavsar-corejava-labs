package com.vaman.lab3;

import java.util.Scanner;

public class Exercise4 {

    static int modifyNumber(int number1) {

        String str = Integer.toString(number1);
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
            int diff = Math.abs(str.charAt(i) - str.charAt(i + 1));
            result += diff;
        }

        result += str.charAt(str.length() - 1);

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int input = sc.nextInt();

        int output = modifyNumber(input);

        System.out.println(output);

        sc.close();
    }
}