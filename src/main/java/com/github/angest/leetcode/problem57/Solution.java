package com.github.angest.leetcode.problem57;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        for (int[] interval : intervals) {
            if (newInterval == null) {
                result.add(interval);
                continue;
            }
            if (interval[1] < newInterval[0]) {
                result.add(interval);
                continue;
            }
            if (interval[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = null;
                result.add(interval);
                continue;
            }
            newInterval[0] = Math.min(interval[0], newInterval[0]);
            newInterval[1] = Math.max(interval[1], newInterval[1]);
        }
        if (newInterval != null) {
            result.add(newInterval);
        }

        return result.toArray(new int[0][0]);
    }
}