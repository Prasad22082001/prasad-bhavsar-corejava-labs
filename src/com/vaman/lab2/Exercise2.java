package com.vaman.lab2;

import java.util.Arrays;

public class Exercise2 {

   
    public static String[] sortStrings(String[] arr) {
        
    	Arrays.sort(arr);
    	int n=arr.length;
    	int mid;
    	if(n%2==0) {
    		mid=n/2;
    	}else {
    		mid=(n/2)+1;
    	}
    	
    	for(int i=0;i<n;i++) {
    		if(i<mid) {
    			arr[i]=arr[i].toUpperCase();
    		}else {
    			arr[i]=arr[i].toLowerCase();
    		}
    	}
    	
    	
    return arr; 
    }
    
    
    public static void main(String[] args) {
		String str[]= {"virat","rohit","sonu","monu","zaheer","arvind","jack"};
		String res[]= sortStrings(str);
		
		for(String s:res) {
			System.out.println(s);
		}
	}
}