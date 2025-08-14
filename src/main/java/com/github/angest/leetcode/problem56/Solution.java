package com.github.angest.leetcode.problem56;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Map<Integer, Integer> startToEnd = new TreeMap<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = Math.max(startToEnd.getOrDefault(start, 0), interval[1]);
            startToEnd.put(start, end);
        }

        List<int[]> result = new ArrayList<>();
        int lastStart = -1;
        int lastEnd = -1;
        for (Map.Entry<Integer, Integer> entry : startToEnd.entrySet()) {
            int start = entry.getKey();
            int end = entry.getValue();
            if (start > lastEnd) {
                if (lastStart >= 0 && lastEnd >= 0) {
                    result.add(new int[]{lastStart, lastEnd});
                }
                lastStart = start;
            }
            if (end > lastEnd) {
                lastEnd = end;
            }
        }
        result.add(new int[]{lastStart, lastEnd});

        return result.toArray(new int[0][0]);
    }
}