package com.github.angest.leetcode.problem34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        if (nums.length > 0) {
            result[0] = searchLeftRight(nums, target, -1);
            result[1] = searchLeftRight(nums, target, 1);
            if (result[0] < 0 || result[1] < 0) {
                result[0] = -1;
                result[1] = -1;
            }
        }

        return result;
    }

    private int searchLeftRight(int[] nums, int target, int leftRight) {
        int left = 0;
        int right = nums.length - 1;
        while (right >= left) {
            int i = (left + right) / 2;
            int direction = getDirection(nums, target, i, leftRight);
            if (direction < 0) {
                right = i - 1;
            }
            if (direction == 0) {
                return i;
            }
            if (direction > 0) {
                left = i + 1;
            }
        }

        return -1;
    }

    private int getDirection(int[] nums, int target, int i, int leftRight) {
        if (nums[i] == target) {
            return i + leftRight >= 0 && i + leftRight < nums.length && nums[i + leftRight] == target ? leftRight : 0;
        } else {
            return target - nums[i];
        }
    }
}
