package com.github.angest.leetcode.problem26;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] input = getValue("input1", int[].class);
        int output = solution.removeDuplicates(input);
        assertEquals(getValue("output1.k", int.class), output);
        assertArrayEquals(getValue("output1.nums", int[].class), input);
    }

    @Test
    public void test2() {
        int[] input = getValue("input2", int[].class);
        int output = solution.removeDuplicates(input);
        assertEquals(getValue("output2.k", int.class), output);
        assertArrayEquals(getValue("output2.nums", int[].class), input);
    }

    @Test
    public void test3() {
        int[] input = getValue("input3", int[].class);
        int output = solution.removeDuplicates(input);
        assertEquals(getValue("output3.k", int.class), output);
        assertArrayEquals(getValue("output3.nums", int[].class), input);
    }
}