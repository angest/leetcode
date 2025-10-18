package com.github.angest.leetcode.problem78;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return subsets(nums, 0);
    }

    private List<List<Integer>> subsets(int[] nums, int index) {
        if (index >= nums.length) {
            return Collections.singletonList(Collections.emptyList());
        } else {
            List<List<Integer>> result = new ArrayList<>();
            for (List<Integer> subset : subsets(nums, index + 1)) {
                result.add(subset);
                List<Integer> withit = new ArrayList<>();
                withit.add(nums[index]);
                withit.addAll(subset);
                result.add(withit);
            }
            return result;
        }
    }
}