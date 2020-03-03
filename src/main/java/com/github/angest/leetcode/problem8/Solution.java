package com.github.angest.leetcode.problem8;

public class Solution {
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        int result = 0;

        boolean discarding = true;
        boolean negative = false;
        for (char c : chars) {
            if (discarding) {
                if (c == ' ') {
                    continue;
                } else {
                    discarding = false;
                    if (c == '+') {
                        continue;
                    } else if (c == '-') {
                        negative = true;
                        continue;
                    }
                }
            }

            int value = c - '0';
            if (value >= 0 && value <= 9) {
                long newResult = (long) result * 10 + value;
                if ((int) newResult == newResult) {
                    result = (int) newResult;
                } else {
                    if (negative) {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
            } else {
                break;
            }
        }

        if (negative) {
            result = -result;
        }

        return result;
    }
}