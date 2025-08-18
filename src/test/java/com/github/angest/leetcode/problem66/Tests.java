package com.github.angest.leetcode.problem66;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertArrayEquals(
                getValue("output1", int[].class),
                solution.plusOne(getValue("input1", int[].class))
        );
    }

    @Test
    public void test2() {
        assertArrayEquals(
                getValue("output2", int[].class),
                solution.plusOne(getValue("input2", int[].class))
        );
    }

    @Test
    public void test3() {
        assertArrayEquals(
                getValue("output3", int[].class),
                solution.plusOne(getValue("input3", int[].class))
        );
    }
}