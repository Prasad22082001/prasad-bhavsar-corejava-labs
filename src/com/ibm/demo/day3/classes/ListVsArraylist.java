package com.ibm.demo.day3.classes;

import java.util.ArrayList;
import java.util.List;



public class ListVsArraylist {
	public static void main(String[] args) {
		List<String> OnlyList=new ArrayList<String>();
		ArrayList<String> OnlyArrayList=new ArrayList<String>();
		
		System.out.println("List");
		OnlyList.add("Jack");
		OnlyList.add("Harry");
		OnlyList.add("Jay");
		OnlyList.add("Roxx");
		System.out.println(OnlyList);
	//	System.out.println(OnlyList.);
		System.out.println("===========================================");
		System.out.println("ÄrrayList");
		OnlyArrayList.add("Ram");
		OnlyArrayList.add("Rohit");
		OnlyArrayList.add("Om");
		OnlyArrayList.add("Hari");
		System.out.println(OnlyArrayList);
	//	System.out.println(OnlyArrayList.);
	
		
		
		
				
	}
	
}
