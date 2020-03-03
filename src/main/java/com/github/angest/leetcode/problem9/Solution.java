package com.github.angest.leetcode.problem9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int y = 0;
        int z = x;
        while (z != 0) {
            long newY = (long) y * 10 + z % 10;
            if ((int) newY == newY) {
                y = (int) newY;
                z = z / 10;
            } else {
                return false;
            }
        }

        return x == y;
    }
}