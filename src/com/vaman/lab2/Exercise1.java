package com.vaman.lab2;

import java.util.Arrays;

public class Exercise1 {
	static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		int secondLarg= arr[arr.length-2];
		return secondLarg;
	}
	public static void main(String[] args) {
		int[] myArr= {12,33,1,65,21,98};
		
		int sl=getSecondSmallest(myArr);
		System.out.println(sl);
	}

}
