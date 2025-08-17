package com.github.angest.leetcode.problem64;

public class Solution {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                if (i > 0 && j > 0) {
                    row[j] += Math.min(grid[i - 1][j], row[j - 1]);
                } else if (i > 0) {
                    row[j] += grid[i - 1][j];
                } else if (j > 0) {
                    row[j] += row[j - 1];
                }
                if (i == grid.length - 1 && j == row.length - 1) {
                    return row[j];
                }
            }
        }
        return 0;
    }
}