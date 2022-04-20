package com.github.angest.leetcode.problem22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        List<char[]> charsList = new ArrayList<>();
        charsList.add(new char[]{0, 0});

        for (int i = 0; i < 2 * n; i++) {
            char[][] charsArray = charsList.toArray(new char[0][0]);
            charsList.clear();
            for (char[] chars : charsArray) {
                char left = chars[0];
                char right = chars[1];
                if (left < n) {
                    if (i + 1 < 2 * n) {
                        char[] newChars = Arrays.copyOf(chars, chars.length + 1);
                        newChars[0] = (char) (left + 1);
                        newChars[i + 2] = '(';
                        charsList.add(newChars);
                    } else {
                        result.add(new String(chars).substring(2) + "(");
                    }
                }
                if (left > right) {
                    if (i + 1 < 2 * n) {
                        char[] newChars = Arrays.copyOf(chars, chars.length + 1);
                        newChars[1] = (char) (right + 1);
                        newChars[i + 2] = ')';
                        charsList.add(newChars);
                    } else {
                        result.add(new String(chars).substring(2) + ")");
                    }
                }
            }
        }

        return result;
    }
}