package com.vaman.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise9 {

    static void findDuration(int day, int month, int year) {

        LocalDate inputDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        Period diff = Period.between(inputDate, currentDate);

        System.out.println("Years: " + diff.getYears());
        System.out.println("Months: " + diff.getMonths());
        System.out.println("Days: " + diff.getDays());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day:");
        int day = sc.nextInt();

        System.out.println("Enter month:");
        int month = sc.nextInt();

        System.out.println("Enter year:");
        int year = sc.nextInt();

        findDuration(day, month, year);

        sc.close();
    }
}