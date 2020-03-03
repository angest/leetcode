package com.github.angest.leetcode.problem11;

public class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (right > left) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            max = Math.max(max, Math.min(leftHeight, rightHeight) * (right - left));
            if (leftHeight >= rightHeight) {
                right--;
            }
            if (leftHeight <= rightHeight) {
                left++;
            }
        }

        return max;
    }
}