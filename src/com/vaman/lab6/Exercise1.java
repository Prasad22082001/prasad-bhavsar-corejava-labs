package com.vaman.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {

    public static List<Integer> getValues(HashMap<String, Integer> map) {
        List<Integer> valuesList = new ArrayList<>(map.values());
        Collections.sort(valuesList);
        return valuesList;
    }

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 50);
        map.put("B", 20);
        map.put("C", 80);
        map.put("D", 10);

        List<Integer> sortedValues = getValues(map);

        System.out.println("Sorted Values: " + sortedValues);
    }
}