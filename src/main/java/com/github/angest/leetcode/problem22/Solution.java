package com.github.angest.leetcode.problem22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        result.add("");

        for (int i = 0; i < 2 * n; i++) {
            String[] strs = result.toArray(result.toArray(new String[0]));
            result.clear();
            for (String str : strs) {
                int left = 0;
                int right = 0;
                for (char c : str.toCharArray()) {
                    if (c == '(') {
                        left++;
                    }
                    if (c == ')') {
                        right++;
                    }
                }
                if (left < n) {
                    result.add(str + '(');
                }
                if (left > right) {
                    result.add(str + ')');
                }
            }
        }

        return result;
    }
}