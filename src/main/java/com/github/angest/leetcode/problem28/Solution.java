package com.github.angest.leetcode.problem28;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();
        int i = 0;
        while (i <= chars1.length - chars2.length) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars1[i + j] != chars2[j]) {
                    break;
                } else {
                    if (j == chars2.length - 1) {
                        return i;
                    }
                }
            }
            i++;
        }


        return -1;
    }
}