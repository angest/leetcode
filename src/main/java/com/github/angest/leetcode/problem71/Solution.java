package com.github.angest.leetcode.problem71;

public class Solution {
    public String simplifyPath(String path) {
        StringBuilder result = new StringBuilder();
        StringBuilder curr = new StringBuilder();
        int up = 0;
        char[] chars = path.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '/') {
                String currs = curr.toString();
                if (".".equals(currs)) {
                } else if ("..".equals(currs)) {
                    up++;
                } else {
                    if (!currs.isEmpty()) {
                        if (up > 0) {
                            up--;
                        } else {
                            result.insert(0, currs);
                            result.insert(0, "/");
                        }
                    }
                }
                curr = new StringBuilder();
            } else {
                curr.insert(0, chars[i]);
            }
        }

        return result.length() > 0 ? result.toString() : "/";
    }
}