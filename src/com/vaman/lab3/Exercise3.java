package com.vaman.lab3;

import java.util.Scanner;

public class Exercise3 {

    static String alterString(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
                ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
                ch = (char)(ch + 1);
            }

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.next();

        String output = alterString(input);

        System.out.println(output);

        sc.close();
    }
}