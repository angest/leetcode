package com.github.angest.leetcode.problem47;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] counts = new int[21];
        for (int num : nums) {
            counts[num + 10]++;
        }

        List<List<Integer>> permutations = new ArrayList<>();

        List<Integer> permutation = new ArrayList<>();
        while (permutation != null) {
            if (!addNum(permutation, counts)) {
                permutations.add(permutation);
                permutation = getNext(permutation, counts);
            }
        }

        return permutations;
    }

    private boolean addNum(List<Integer> permutation, int[] counts) {
        for (int num = -10; num <= 10; num++) {
            int count = counts[num + 10];
            if (count > 0) {
                counts[num + 10]--;
                permutation.add(num);
                return true;
            }
        }
        return false;
    }

    private List<Integer> getNext(List<Integer> permutation, int[] counts) {
        List<Integer> next = new ArrayList<>(permutation);
        while (!next.isEmpty()) {
            int removed = next.remove(next.size() - 1);
            counts[removed + 10]++;
            for (int i = removed + 1; i <= 10; i++) {
                if (counts[i + 10] > 0) {
                    counts[i + 10]--;
                    next.add(i);
                    return next;
                }
            }
        }
        return null;
    }
}