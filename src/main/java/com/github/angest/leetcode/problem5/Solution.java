package com.github.angest.leetcode.problem5;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        char[] chars = s.toCharArray();
        int[] longestRange = new int[]{0, 0};

        int left = chars.length / 2;
        if (chars.length % 2 == 0) {
            left--;
        }

        while ((Math.min(left, chars.length - 1 - left) + 1) * 2 > longestRange[1] - longestRange[0]) {
            int[] range = range(chars, left, left);
            if (range[1] - range[0] > longestRange[1] - longestRange[0]) {
                longestRange = range;
            }
            if (left + 1 < chars.length && chars[left] == chars[left + 1]) {
                range = range(chars, left, left + 1);
                if (range[1] - range[0] > longestRange[1] - longestRange[0]) {
                    longestRange = range;
                }
            }

            if (left >= chars.length / 2) {
                left = chars.length - left - 2;
            } else {
                left = chars.length - left - 1;
            }
        }

        return s.substring(longestRange[0], longestRange[1] + 1);
    }

    private int[] range(char[] chars, int left, int right) {
        while (true) {
            if (left - 1 >= 0 && right + 1 < chars.length && chars[left - 1] == chars[right + 1]) {
                left--;
                right++;
            } else {
                return new int[]{left, right};
            }
        }
    }
}