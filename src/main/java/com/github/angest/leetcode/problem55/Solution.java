package com.github.angest.leetcode.problem55;

public class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = i + nums[i];
            if (curr >= max) {
                if (nums[i] == 0 && i < nums.length - 1) {
                    return false;
                } else {
                    max = curr;
                }
            }
        }
        return true;
    }
}