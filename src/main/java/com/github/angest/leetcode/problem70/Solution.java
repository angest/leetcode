package com.github.angest.leetcode.problem70;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }
}