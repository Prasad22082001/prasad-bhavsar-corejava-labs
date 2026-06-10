package com.vaman.lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

    public static Map<Integer, Integer> getSquares(int[] arr) {
        Map<Integer, Integer> squareMap = new HashMap<>();

        for (int num : arr) {
            squareMap.put(num, num * num);
        }

        return squareMap;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};

        Map<Integer, Integer> result = getSquares(numbers);

        System.out.println(result);
    }
}