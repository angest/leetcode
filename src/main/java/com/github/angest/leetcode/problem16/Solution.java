package com.github.angest.leetcode.problem16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Integer result = null;

        Arrays.sort(nums);
        List<Integer> numList = new ArrayList<>();
        int count = 0;
        for (int num : nums) {
            if (numList.isEmpty() || num != numList.get(numList.size() - 1)) {
                numList.add(num);
                count = 1;
            } else {
                if (count < 3) {
                    numList.add(num);
                    count++;
                }
            }
        }

        Integer[] sortedNums = numList.toArray(new Integer[0]);
        for (int i = 0; i < sortedNums.length - 2; i++) {
            int times3 = sortedNums[i] * 3;
            if (result != null && times3 > target && times3 - target > Math.abs(result - target)) {
                return result;
            }

            int left = i + 1;
            int right = sortedNums.length - 1;
            while (left < right) {
                int sum = sortedNums[i] + sortedNums[left] + sortedNums[right];
                if (sum == target) {
                    return target;
                } else {
                    if (result == null || Math.abs(sum - target) < Math.abs(result - target)) {
                        result = sum;
                    }
                    if (sum > target) {
                        right--;
                    }
                    if (sum < target) {
                        left++;
                    }
                }
            }
        }

        return result;
    }
}