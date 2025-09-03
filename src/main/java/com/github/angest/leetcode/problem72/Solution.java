package com.github.angest.leetcode.problem72;

public class Solution {
    public int minDistance(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int[][] distances = new int[chars1.length + 1][chars2.length + 1];
        for (int i = 0; i <= chars1.length; i++) {
            distances[i][0] = i;
        }
        for (int i = 0; i <= chars2.length; i++) {
            distances[0][i] = i;
        }
        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                int distance = Math.min(distances[i - 1][j] + 1, distances[i][j - 1] + 1);
                distance = Math.min(distance, distances[i - 1][j - 1] + (chars1[i - 1] != chars2[j - 1] ? 1 : 0));
                distances[i][j] = distance;
            }
        }

        return distances[chars1.length][chars2.length];
    }
}