package com.github.angest.leetcode.problem18;

import java.util.*;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);
        List<Integer> numList = new ArrayList<>();
        int count = 0;
        for (int num : nums) {
            if (numList.isEmpty() || num != numList.get(numList.size() - 1)) {
                numList.add(num);
                count = 1;
            } else {
                if (count < 4) {
                    numList.add(num);
                    count++;
                }
            }
        }
        Integer[] sortedNums = numList.toArray(new Integer[0]);

        for (int i = 0; i < sortedNums.length - 3 && sortedNums[i] <= target / 4; i++) {
            for (int j = i + 1; j < sortedNums.length - 2; j++) {
                int left = j + 1;
                int right = sortedNums.length - 1;
                while (left < right) {
                    int sum = sortedNums[i] + sortedNums[j] + sortedNums[left] + sortedNums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(sortedNums[i], sortedNums[j], sortedNums[left], sortedNums[right]));
                        left++;
                        right--;
                    }
                    if (sum < target) {
                        left++;
                    }
                    if (sum > target) {
                        right--;
                    }
                }
            }
        }

        return new ArrayList<>(result);
    }
}