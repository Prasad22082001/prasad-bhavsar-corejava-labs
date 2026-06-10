package com.ibm.demo.day3.classes;

import java.util.ArrayList;

public class CollectionDemo {
public static void main(String[] args) {
	ArrayList friends=new ArrayList();
	
	System.out.println(friends.size());
	friends.add(friends);
	System.out.println(friends);
	
	friends.add("Shyam");
	friends.add(123);
	friends.add(false);
	friends.add(null);
	
	System.out.println(friends.size());
	
	System.out.println(friends);
}

}
