package com.github.angest.leetcode.problem17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        List<List<String>> letters = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i"),
                Arrays.asList("j", "k", "l"),
                Arrays.asList("m", "n", "o"),
                Arrays.asList("p", "q", "r", "s"),
                Arrays.asList("t", "u", "v"),
                Arrays.asList("w", "x", "y", "z")
        );

        if (digits.length() == 1) {
            return letters.get(digits.charAt(0) - '2');
        }

        List<String> result = new ArrayList<>(letters.get(digits.charAt(0) - '2'));
        for (int i = 1; i < digits.length(); i++) {
            List<String> newResult = new ArrayList<>();
            for (String s1 : result) {
                for (String s2 : letters.get(digits.charAt(i) - '2')) {
                    newResult.add(s1 + s2);
                }
            }
            result = newResult;
        }

        return result;
    }
}