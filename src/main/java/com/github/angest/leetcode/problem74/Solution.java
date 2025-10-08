package com.github.angest.leetcode.problem74;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            int value = matrix[middle / n][middle % n];
            if (value == target) {
                return true;
            }
            if (value < target) {
                left = middle + 1;
            }
            if (value > target) {
                right = middle - 1;
            }
        }
        return false;
    }
}