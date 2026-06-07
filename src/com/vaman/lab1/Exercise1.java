package com.vaman.lab1;

import java.util.Scanner;

public class Exercise1 {
	static int sumOfCubes(int num) {
	    int sum = 0;

	    while (num > 0) {
	        int digit = num % 10;            // Extract digit
	        int cube = digit * digit * digit;
	        sum = sum + cube;               // Add to total
	        num = num / 10;
	    }

	    return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int op=Exercise1.sumOfCubes(n);
		System.out.println(op);
	}
}
