package com.vaman.lab3;

import java.util.Scanner;

public class Exercise2 {

    static String getImage(String str) {

        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();

        return str + "|" + rev;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Ënter the String");
        String input = sc.next();
        String output = getImage(input);

        System.out.println(output);
    }
}