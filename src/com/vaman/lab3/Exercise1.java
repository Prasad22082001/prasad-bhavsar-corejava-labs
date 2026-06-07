package com.vaman.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers:");
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input);

        int sum = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}