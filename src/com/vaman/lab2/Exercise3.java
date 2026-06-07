package com.vaman.lab2;

import java.util.Arrays;

public class Exercise3 {

    static int[] getSorted(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String str = Integer.toString(arr[i]);
            String reversed = new StringBuilder(str).reverse().toString();
            result[i] = Integer.parseInt(reversed);
        }

        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] input = {12, 45, 78, 90};
        int[] output = getSorted(input);

        for (int num : output) {
            System.out.print(num + " ");
        }
    }
}