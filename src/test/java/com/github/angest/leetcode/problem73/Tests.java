package com.github.angest.leetcode.problem73;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[][] result = getValue("input1", int[][].class);
        solution.setZeroes(result);
        assertArrayEquals(getValue("output1", int[][].class), result);
    }

    @Test
    public void test2() {
        int[][] result = getValue("input2", int[][].class);
        solution.setZeroes(result);
        assertArrayEquals(getValue("output2", int[][].class), result);
    }

    @Test
    public void test3() {
        int[][] result = getValue("input3", int[][].class);
        solution.setZeroes(result);
        assertArrayEquals(getValue("output3", int[][].class), result);
    }
}