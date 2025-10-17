package com.github.angest.leetcode.problem77;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        int[] offsets = new int[k];
        Arrays.fill(offsets, 0);
        int offsetSum = 0;

        while (true) {
            List<Integer> intList = new ArrayList<>();
            int offset = 0;
            for (int i = 0; i < k; i++) {
                offset += offsets[i];
                intList.add(i + 1 + offset);
            }
            result.add(intList);

            if (offsets[0] == n - k) {
                break;
            }

            if (offsetSum < n - k) {
                offsetSum++;
                offsets[offsets.length - 1]++;
            } else {
                for (int j = k - 1; j >= 0; j--) {
                    if (offsets[j] > 0) {
                        offsetSum++;
                        offsets[j - 1]++;
                        offsetSum -= offsets[j];
                        offsets[j] = 0;
                        break;
                    }
                }
            }
        }

        return result;
    }
}