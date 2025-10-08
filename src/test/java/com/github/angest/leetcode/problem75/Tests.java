package com.github.angest.leetcode.problem75;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] result = getValue("input1", int[].class);
        solution.sortColors(result);
        assertArrayEquals(getValue("output1", int[].class), result);
    }

    @Test
    public void test2() {
        int[] result = getValue("input2", int[].class);
        solution.sortColors(result);
        assertArrayEquals(getValue("output2", int[].class), result);
    }
}