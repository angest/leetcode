package com.github.angest.leetcode.problem38;

public class Solution {
    public String countAndSay(int n) {
        String count = "1";
        for (int i = 1; i < n; i++) {
            count = say(count);
        }
        return count;
    }

    private String say(String s) {
        StringBuilder sb = new StringBuilder();

        int number = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c - '0' != number) {
                if (count > 0) {
                    sb.append(count).append(number);
                }
                number = c - '0';
                count = 0;
            }
            if (c - '0' == number) {
                count++;
            }
        }
        sb.append(count).append(number);

        return sb.toString();
    }
}
