package com.github.angest.leetcode.problem17;

import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> letterMap = new HashMap<>();
        letterMap.put('2', "abc");
        letterMap.put('3', "def");
        letterMap.put('4', "ghi");
        letterMap.put('5', "jkl");
        letterMap.put('6', "mno");
        letterMap.put('7', "pqrs");
        letterMap.put('8', "tuv");
        letterMap.put('9', "wxyz");

        Set<String> result = new HashSet<>();
        for (char digit : digits.toCharArray()) {
            addCombinations(result, letterMap.get(digit));
        }

        return new ArrayList<>(result);
    }

    private void addCombinations(Set<String> result, String letters) {
        String[] strings = result.toArray(new String[0]);
        if (strings.length < 1) {
            strings = new String[]{""};
        }

        result.clear();
        for (String s : strings) {
            for (char c : letters.toCharArray()) {
                result.add(s + c);
            }
        }
    }
}