package com.github.angest.leetcode.problem57;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertArrayEquals(
                getValue("output1", int[][].class),
                solution.insert(getValue("input1.intervals", int[][].class), getValue("input1.newInterval", int[].class))
        );
    }

    @Test
    public void test2() {
        assertArrayEquals(
                getValue("output2", int[][].class),
                solution.insert(getValue("input2.intervals", int[][].class), getValue("input2.newInterval", int[].class))
        );
    }
}