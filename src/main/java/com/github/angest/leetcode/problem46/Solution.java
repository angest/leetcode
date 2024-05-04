package com.github.angest.leetcode.problem46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = null;
        for (int num : nums) {
            result = permute(result, num);
        }
        return result;
    }

    private List<List<Integer>> permute(List<List<Integer>> result, int num) {
        if (result == null) {
            return Collections.singletonList(Collections.singletonList(num));
        }

        List<List<Integer>> newResult = new ArrayList<>();
        for (List<Integer> nums : result) {
            for (int i = 0; i <= nums.size(); i++) {
                List<Integer> newNums = new ArrayList<>(nums);
                newNums.add(i, num);
                newResult.add(newNums);
            }
        }
        return newResult;
    }
}