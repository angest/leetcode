package com.github.angest.leetcode.problem12;

public class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        appendRoman(sb, num / 1000 % 10, 'M', ' ', ' ');
        appendRoman(sb, num / 100 % 10, 'C', 'D', 'M');
        appendRoman(sb, num / 10 % 10, 'X', 'L', 'C');
        appendRoman(sb, num % 10, 'I', 'V', 'X');

        return sb.toString();
    }

    private void appendRoman(StringBuilder sb, int digit, char char1, char char5, char char10) {
        if (digit % 5 == 4) {
            sb.append(char1);
        }
        if (digit % 10 == 9) {
            sb.append(char10);
        } else if (digit % 10 > 3) {
            sb.append(char5);
        }
        if (digit % 5 < 4) {
            for (int i = 0; i < digit % 5; i++) {
                sb.append(char1);
            }
        }
    }
}