package com.github.angest.leetcode.problem59;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertArrayEquals(
                getValue("output1", int[][].class),
                solution.generateMatrix(getValue("input1", int.class))
        );
    }

    @Test
    public void test2() {
        assertArrayEquals(
                getValue("output2", int[][].class),
                solution.generateMatrix(getValue("input2", int.class))
        );
    }
}