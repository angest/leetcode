package com.github.angest.leetcode.problem1;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertArrayEquals(
                getValue("output1", int[].class),
                solution.twoSum(getValue("input1.nums", int[].class), getValue("input1.target", int.class))
        );
    }
}