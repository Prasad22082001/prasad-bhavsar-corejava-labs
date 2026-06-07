package com.vaman.lab3;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        int characters = text.length();

        String[] wordsArray = text.trim().split("\\s+");
        int words = (text.trim().isEmpty()) ? 0 : wordsArray.length;

        String[] linesArray = text.split("\n");
        int lines = linesArray.length;

        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);

        sc.close();
    }
}