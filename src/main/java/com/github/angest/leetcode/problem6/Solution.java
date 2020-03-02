package com.github.angest.leetcode.problem6;

public class Solution {
    public String convert(String s, int numRows) {
        if (s.length() < 3 || numRows < 2 || s.length() <= numRows) {
            return s;
        }

        int loop = numRows - 1;
        int numColumns = s.length() / (2 * loop) + 1;
        numColumns = numColumns * loop;
        char[][] matrix = new char[numRows][numColumns];

        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            matrix[x][y] = s.charAt(i);
            if (y % loop == 0 && x < loop) {
                x++;
            } else {
                y++;
                x--;
            }
        }

        char[] result = new char[s.length()];
        int index = 0;
        for (char[] row : matrix) {
            for (char c : row) {
                if (c != 0) {
                    result[index++] = c;
                }
            }
        }

        return new String(result);
    }
}