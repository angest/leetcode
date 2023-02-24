package com.github.angest.leetcode.problem35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        int left = 0;
        int right = nums.length - 1;
        while (right - left > 1) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                left = middle;
            }
            if (nums[middle] > target) {
                right = middle;
            }
        }

        return nums[left] == target ? left : right;
    }
}
