package com.github.angest.leetcode.problem75;

public class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while (left < right && i < nums.length) {
            if (nums[i] == 0 && i > left) {
                nums[i] = nums[left];
                nums[left] = 0;
                left++;
            } else if (nums[i] == 2 && i < right) {
                nums[i] = nums[right];
                nums[right] = 2;
                right--;
            } else {
                i++;
            }
        }
    }
}