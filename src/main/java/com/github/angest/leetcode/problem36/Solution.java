package com.github.angest.leetcode.problem36;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isValid(board, 3 * i + j, 3 * i + j, 0, 8)) {
                    return false;
                }
                if (!isValid(board, 0, 8, 3 * i + j, 3 * i + j)) {
                    return false;
                }
                if (!isValid(board, 3 * i, 3 * i + 2, 3 * j, 3 * j + 2)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValid(char[][] board, int u, int d, int l, int r) {
        boolean[] digits = new boolean[9];
        for (int i = u; i <= d; i++) {
            for (int j = l; j <= r; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                if (digits[c - '1']) {
                    return false;
                }
                digits[c - '1'] = true;
            }
        }
        return true;
    }
}
