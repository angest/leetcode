package com.github.angest.leetcode.problem54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int size = matrix.length * matrix[0].length;
        int x = 0;
        int y = 0;
        int loop = 0;
        char direction = 'r';
        while (result.size() < size) {
            result.add(matrix[x][y]);
            switch (direction) {
                case 'r':
                    if (y + 1 < matrix[0].length - loop) {
                        y++;
                    } else {
                        x++;
                        direction = 'd';
                    }
                    break;
                case 'd':
                    if (x + 1 < matrix.length - loop) {
                        x++;
                    } else {
                        y--;
                        direction = 'l';
                    }
                    break;
                case 'l':
                    if (y > loop) {
                        y--;
                    } else {
                        x--;
                        direction = 'u';
                    }
                    break;
                case 'u':
                    if (x > loop + 1) {
                        x--;
                    } else {
                        y++;
                        direction = 'r';
                        loop++;
                    }
                    break;
                default:
                    break;
            }
        }

        return result;
    }
}