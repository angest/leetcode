package com.github.angest.leetcode.problem48;

public class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int x = 0; x < (len + 1) / 2; x++) {
            for (int y = 0; y < len / 2; y++) {
                rotate(matrix, x, y);
            }
        }
    }

    private void rotate(int[][] matrix, int x, int y) {
        int len = matrix.length;
        int tmp = matrix[x][y];

        matrix[x][y] = matrix[len - y - 1][x];
        matrix[len - y - 1][x] = matrix[len - x - 1][len - y - 1];
        matrix[len - x - 1][len - y - 1] = matrix[y][len - x - 1];
        matrix[y][len - x - 1] = tmp;
    }
}