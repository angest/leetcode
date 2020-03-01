package com.github.angest.leetcode.problem3;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int longest = 0;
        int left = 0;
        int right = 0;
        java.util.Set<Character> charSet = new java.util.HashSet<>();

        while (left < chars.length && right < chars.length) {
            if (charSet.add(chars[right])) {
                right++;
            } else {
                if (charSet.size() > longest) {
                    longest = charSet.size();
                }
                charSet.remove(chars[left]);
                left++;
            }
        }

        if (charSet.size() > longest) {
            longest = charSet.size();
        }
        return longest;
    }
}