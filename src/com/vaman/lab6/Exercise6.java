package com.vaman.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {

    public static List<Integer> votersList(Map<Integer, Integer> ageMap) {

        List<Integer> voters = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : ageMap.entrySet()) {

            if (entry.getValue() > 18) {
                voters.add(entry.getKey());
            }
        }

        return voters;
    }

    public static void main(String[] args) {

        Map<Integer, Integer> ageMap = new HashMap<>();

        ageMap.put(101, 25);
        ageMap.put(102, 17);
        ageMap.put(103, 30);
        ageMap.put(104, 18);
        ageMap.put(105, 21);

        List<Integer> eligibleVoters = votersList(ageMap);

        System.out.println("Eligible Voter IDs: " + eligibleVoters);
    }
}