package com.github.angest.leetcode.problem73;

public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        long[] x = new long[4];
        long[] y = new long[4];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                long xx = 1L << (i % 50);
                long yy = 1L << (j % 50);
                if (matrix[i][j] == 0) {
                    x[i / 50] |= xx;
                    y[j / 50] |= yy;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                long xx = 1L << (i % 50);
                long yy = 1L << (j % 50);
                if ((x[i / 50] & xx) == xx) {
                    matrix[i][j] = 0;
                }
                if ((y[j / 50] & yy) == yy) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}