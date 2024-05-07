package com.github.angest.leetcode.problem49;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            int[] letters = new int[26];
            for (char c : str.toCharArray()) {
                letters[c - 'a']++;
            }
            groups.computeIfAbsent(Arrays.hashCode(letters), key -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}