package com.github.angest.leetcode.problem39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return getCombinations(candidates, target, 0);
    }

    private List<List<Integer>> getCombinations(int[] candidates, int target, int min) {
        List<List<Integer>> combinations = new ArrayList<>();
        for (int candidate : candidates) {
            if (candidate < min) {
                continue;
            }
            if (candidate < target) {
                for (List<Integer> combination : getCombinations(candidates, target - candidate, candidate)) {
                    combination.add(0, candidate);
                    combinations.add(combination);
                }
            }
            if (candidate == target) {
                List<Integer> combination = new ArrayList<>();
                combination.add(candidate);
                combinations.add(combination);
                break;
            }
            if (candidate > target) {
                break;
            }
        }
        return combinations;
    }
}
