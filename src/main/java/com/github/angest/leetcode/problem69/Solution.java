package com.github.angest.leetcode.problem69;

public class Solution {
    public int mySqrt(int x) {
        int min = 0;
        int max = 0xB505;
        while (max - min > 1) {
            if (min * min == x) {
                return min;
            }
            if (max * max == x) {
                return max;
            }
            int guess = (min + max) / 2;
            int sq = guess * guess;
            if (sq < x) {
                min = guess;
            }
            if (sq == x) {
                return guess;
            }
            if (sq > x) {
                max = guess;
            }
        }
        return min;
    }
}