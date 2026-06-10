package com.vaman.lab9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {

    public static boolean validateUserName(String userName) {

        String regex = "^[A-Za-z0-9]{8,}_job$";

        return Pattern.matches(regex, userName);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String userName = sc.nextLine();

        boolean result = validateUserName(userName);

        System.out.println(result);

        sc.close();
    }
}