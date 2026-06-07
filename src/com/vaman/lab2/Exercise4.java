package com.vaman.lab2;

import java.util.Arrays;

public class Exercise4 {

    static int[] modifyArray(int[] arr) {
        Arrays.sort(arr);

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        int[] result = new int[count];
        result[0] = arr[0];
        int j = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[j++] = arr[i];
            }
        }

        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 2, 3, 4, 1};

        int[] result = modifyArray(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}