package com.github.angest.leetcode.problem40;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int[] frequency = new int[target + 1];
        for (int candidate : candidates) {
            if (candidate <= target && frequency[candidate] * candidate + candidate <= target) {
                frequency[candidate]++;
            }
        }
        return getCombinations(1, target, frequency);
    }

    private List<List<Integer>> getCombinations(int candidate, int target, int[] frequency) {
        List<List<Integer>> combinations = new ArrayList<>();
        if (candidate > target) {
            return combinations;
        }
        for (int i = 0; i <= frequency[candidate]; i++) {
            if (i * candidate < target) {
                for (List<Integer> combination : getCombinations(candidate + 1, target - i * candidate, frequency)) {
                    for (int j = 0; j < i; j++) {
                        combination.add(0, candidate);
                    }
                    combinations.add(combination);
                }
            }
            if (i * candidate == target) {
                List<Integer> combination = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    combination.add(0, candidate);
                }
                combinations.add(combination);
            }
            if (i * candidate > target) {
                break;
            }
        }
        return combinations;
    }
}
