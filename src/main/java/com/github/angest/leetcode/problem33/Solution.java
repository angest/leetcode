package com.github.angest.leetcode.problem33;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (right - left > 1) {
            int middle = (left + right) / 2;
            if (between(nums[left], nums[middle], target)) {
                right = middle;
            } else if (between(nums[middle], nums[right], target)) {
                left = middle;
            } else {
                return -1;
            }
        }

        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }

        return -1;
    }

    private boolean between(int left, int right, int target) {
        return (left <= target && target <= right) || (right <= left && left <= target) || (target <= right && right <= left);
    }
}
