package com.github.angest.leetcode.problem15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> results = new HashSet<>();

        Map<Integer, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> indexes = indexMap.computeIfAbsent(-nums[i], s -> new ArrayList<>());
            if (indexes.size() < 3) {
                indexes.add(i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> indexes = indexMap.get(nums[i] + nums[j]);
                if (containsOther(indexes, i, j)) {
                    List<Integer> result = new ArrayList<>();
                    result.add(nums[i]);
                    result.add(nums[j]);
                    result.add(-nums[i] - nums[j]);
                    result.sort(Integer::compareTo);
                    results.add(result);
                }
            }
        }

        return new ArrayList<>(results);
    }

    private boolean containsOther(List<Integer> indexes, int i, int j) {
        if (indexes != null) {
            for (int index : indexes) {
                if (index != i && index != j) {
                    return true;
                }
            }
        }
        return false;
    }
}