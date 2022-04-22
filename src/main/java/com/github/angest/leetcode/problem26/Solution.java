package com.github.angest.leetcode.problem26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[k]) {
                nums[++k] = nums[i];
            }
            if (i != k) {
                nums[i] = 0;
            }
        }
        return k + 1;
    }
}