package com.github.angest.leetcode.problem43;

public class Solution {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();

        int[] sum = new int[chars1.length + chars2.length];
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                sum[i + j + 1] += (chars1[i] - '0') * (chars2[j] - '0');
            }
        }
        for (int i = sum.length - 1; i > 0; i--) {
            sum[i - 1] += sum[i] / 10;
            sum[i] = sum[i] % 10;
        }

        char[] result = new char[sum[0] > 0 ? sum.length : sum.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) ('0' + sum[sum[0] > 0 ? i : i + 1]);
        }
        return new String(result);
    }
}
