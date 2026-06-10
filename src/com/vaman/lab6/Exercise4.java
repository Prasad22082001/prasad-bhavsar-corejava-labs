package com.vaman.lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {

    public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> marksMap) {

        HashMap<Integer, String> medalMap = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : marksMap.entrySet()) {

            int regNo = entry.getKey();
            int marks = entry.getValue();

            if (marks >= 90) {
                medalMap.put(regNo, "Gold");
            } else if (marks >= 80) {
                medalMap.put(regNo, "Silver");
            } else if (marks >= 70) {
                medalMap.put(regNo, "Bronze");
            }
        }

        return medalMap;
    }

    public static void main(String[] args) {

        HashMap<Integer, Integer> marksMap = new HashMap<>();

        marksMap.put(101, 95);
        marksMap.put(102, 85);
        marksMap.put(103, 75);
        marksMap.put(104, 65);

        HashMap<Integer, String> result = getStudents(marksMap);

        System.out.println(result);
    }
}