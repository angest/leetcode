package com.github.angest.leetcode.problem15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            int times = numMap.computeIfAbsent(num, s -> 0);
            if (times < 3) {
                numMap.put(num, times + 1);
            }
        }

        if (numMap.containsKey(0) && numMap.get(0) > 2) {
            addResult(results, 0, 0, 0);
        }

        numMap.forEach((key, value) -> {
            if (key != 0 && value > 1 && numMap.containsKey(-2 * key)) {
                if (key > 0) {
                    addResult(results, -2 * key, key, key);
                } else {
                    addResult(results, key, key, -2 * key);
                }
            }
        });

        Integer[] keys = numMap.keySet().toArray(new Integer[0]);
        Arrays.sort(keys);

        for (int i = 0; i < keys.length - 2; i++) {
            int left = i + 1;
            int right = keys.length - 1;
            while (left < right) {
                int sum = keys[i] + keys[left] + keys[right];
                if (sum < 0) {
                    left++;
                }
                if (sum == 0) {
                    addResult(results, keys[i], keys[left], keys[right]);
                    left++;
                    right--;
                }
                if (sum > 0) {
                    right--;
                }
            }
        }

        return results;
    }

    private void addResult(List<List<Integer>> results, int i, int j, int k) {
        List<Integer> result = new ArrayList<>();
        result.add(i);
        result.add(j);
        result.add(k);
        results.add(result);
    }
}