package com.github.angest.leetcode.problem63;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for (int i = 0; i < obstacleGrid.length; i++) {
            int[] row = obstacleGrid[i];
            for (int j = 0; j < row.length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                } else if (i == 0 && j == 0) {
                    obstacleGrid[i][j] = 1;
                } else {
                    int up = i > 0 ? obstacleGrid[i - 1][j] : 0;
                    int left = j > 0 ? obstacleGrid[i][j - 1] : 0;
                    obstacleGrid[i][j] = up + left;
                }
                if (i == obstacleGrid.length - 1 && j == row.length - 1) {
                    return obstacleGrid[i][j];
                }
            }
        }
        return 0;
    }
}