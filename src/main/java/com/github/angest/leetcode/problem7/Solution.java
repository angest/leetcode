package com.github.angest.leetcode.problem7;

public class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        if (negative) {
            x = -x;
        }

        int y = 0;
        while (x != 0) {
            long newY = (long) y * 10 + x % 10;
            if ((int) newY == newY) {
                y = (int) newY;
                x = x / 10;
            } else {
                return 0;
            }
        }

        if (negative) {
            y = -y;
        }

        return y;
    }
}