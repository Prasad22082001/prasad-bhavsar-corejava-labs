package com.vaman.lab1;

import java.util.Scanner;

/*
 : Write a Java program that simulates a traffic light. 
 The program lets the user select one of three lights — red, yellow, or green — using integer inputs. 
 On entering the choice, an appropriate message ("stop", "ready", or "go") 
 should appear in the console.


 
 */
public class Exercise2 {
	public static String traffic(int light) {
		
		if(light==1)
			return "Stop";
		else if(light==2)
			return "ready";
		else if(light==3)
			return "go";
		else
			return "Invalid Choice";
			
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your choice ");
		System.err.println("1 for red");
		System.err.println("2 for yello");
		System.err.println("3 for green");
		int i=sc.nextInt();
		String op=Exercise2.traffic(i);
		System.out.println(op);
		
		
	}
}
