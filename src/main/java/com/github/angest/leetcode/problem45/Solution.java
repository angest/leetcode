package com.github.angest.leetcode.problem45;

public class Solution {
    public int jump(int[] nums) {
        int result = 0;

        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        int index = nums.length - 1;
        while (index > 0) {
            result++;
            index = findLeft(nums, index, max);
        }

        return result;
    }

    private int findLeft(int[] nums, int right, int max) {
        int left = right - max;
        if (left < 0) {
            left = 0;
        }

        for (int i = left; i < right; i++) {
            if (i + nums[i] >= right) {
                return i;
            }
        }

        return 0;
    }
}