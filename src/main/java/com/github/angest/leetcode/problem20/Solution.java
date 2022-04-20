package com.github.angest.leetcode.problem20;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    deque.push(c);
                    break;
                case ')':
                    if (deque.isEmpty() || !deque.pop().equals('(')) {
                        return false;
                    }
                    break;
                case '}':
                    if (deque.isEmpty() || !deque.pop().equals('{')) {
                        return false;
                    }
                    break;
                case ']':
                    if (deque.isEmpty() || !deque.pop().equals('[')) {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }

        return deque.isEmpty();
    }
}