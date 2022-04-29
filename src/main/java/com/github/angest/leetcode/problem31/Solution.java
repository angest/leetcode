package com.github.angest.leetcode.problem31;

public class Solution {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                reverse(nums, i, nums.length - 1);
                for (int j = i; j < nums.length; j++) {
                    if (nums[i - 1] < nums[j]) {
                        exchange(nums, i - 1, j);
                        return;
                    }
                }
            }
        }
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            exchange(nums, left++, right--);
        }
    }

    private void exchange(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}