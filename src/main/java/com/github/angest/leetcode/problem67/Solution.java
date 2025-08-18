package com.github.angest.leetcode.problem67;

public class Solution {
    public String addBinary(String a, String b) {
        char[] charsa = a.toCharArray();
        char[] charsb = b.toCharArray();
        int lengtha = charsa.length;
        int lengthb = charsb.length;
        StringBuilder result = new StringBuilder();
        int left = 0;
        for (int i = 0; i < lengtha || i < lengthb; i++) {
            int digita = i < lengtha ? charsa[lengtha - 1 - i] - '0' : 0;
            int digitb = i < lengthb ? charsb[lengthb - 1 - i] - '0' : 0;
            int sum = digita + digitb + left;
            result.append(sum % 2);
            left = sum / 2;
        }
        if (left == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}