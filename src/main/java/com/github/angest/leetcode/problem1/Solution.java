package com.github.angest.leetcode.problem1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sorted = java.util.Arrays.copyOf(nums, nums.length);
        java.util.Arrays.sort(sorted);

        int left = 0;
        int right = sorted.length - 1;
        int diff;
        while ((diff = sorted[left] + sorted[right] - target) != 0) {
            if (diff > 0) {
                right--;
            }
            if (diff < 0) {
                left++;
            }
        }

        Integer[] result = new Integer[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == sorted[left] || nums[i] == sorted[right]) {
                if (result[0] == null) {
                    result[0] = i;
                } else {
                    result[1] = i;
                    break;
                }
            }
        }

        return new int[]{result[0], result[1]};
    }
}