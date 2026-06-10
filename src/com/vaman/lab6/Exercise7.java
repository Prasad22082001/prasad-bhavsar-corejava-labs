package com.vaman.lab6;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise7 {

    public static int[] getSorted(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {

            String str = Integer.toString(num);
            String revStr = new StringBuilder(str).reverse().toString();

            list.add(Integer.parseInt(revStr));
        }

        Collections.sort(list);

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {12, 56, 31, 89};

        int[] result = getSorted(numbers);

        System.out.print("Sorted Reversed Array: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}	