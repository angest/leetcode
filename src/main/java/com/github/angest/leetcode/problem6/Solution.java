package com.github.angest.leetcode.problem6;

public class Solution {
    public String convert(String s, int numRows) {
        if (s.length() < 3 || numRows < 2 || s.length() <= numRows) {
            return s;
        }

        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];
        int loop = 2 * numRows - 2;
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = chars[index];
            int next = index / loop * loop + loop - index % loop;
            if (next <= index) {
                next += loop;
            }
            if (next > result.length - 1) {
                next = Math.min(next % loop, loop - next % loop) + 1;
            }
            index = next;
        }

        return new String(result);
    }
}