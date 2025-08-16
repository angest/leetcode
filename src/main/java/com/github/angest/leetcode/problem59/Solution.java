package com.github.angest.leetcode.problem59;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int x = 0;
        int y = 0;
        char direction = 'r';
        for (int i = 1; i <= n * n; i++) {
            result[x][y] = i;
            switch (direction) {
                case 'r':
                    if (y < n - 1 && result[x][y + 1] == 0) {
                        y++;
                    } else {
                        direction = 'd';
                        x++;
                    }
                    break;
                case 'd':
                    if (x < n - 1 && result[x + 1][y] == 0) {
                        x++;
                    } else {
                        direction = 'l';
                        y--;
                    }
                    break;
                case 'l':
                    if (y > 0 && result[x][y - 1] == 0) {
                        y--;
                    } else {
                        direction = 'u';
                        x--;
                    }
                    break;
                case 'u':
                    if (x > 0 && result[x - 1][y] == 0) {
                        x--;
                    } else {
                        direction = 'r';
                        y++;
                    }
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}