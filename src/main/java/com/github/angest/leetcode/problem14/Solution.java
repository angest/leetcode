package com.github.angest.leetcode.problem14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }

        int i = 0;
        while (i < minLength) {
            if (!allMatch(strs, i)) {
                break;
            } else {
                i++;
            }
        }

        return strs[0].substring(0, i);
    }

    private boolean allMatch(String[] strs, int index) {
        char c = strs[0].charAt(index);
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].charAt(index) != c) {
                return false;
            }
        }

        return true;
    }
}