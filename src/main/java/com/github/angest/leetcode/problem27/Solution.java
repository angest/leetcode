package com.github.angest.leetcode.problem27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
            } else {
                nums[k] = nums[i];
                if (i != k) {
                    nums[i] = 0;
                }
                k++;
            }
        }
        return k;
    }
}