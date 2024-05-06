package com.github.angest.leetcode.problem48;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[][] matrix = getValue("input1", int[][].class);
        solution.rotate(matrix);
        assertArrayEquals(
                getValue("output1", int[][].class),
                matrix
        );
    }

    @Test
    public void test2() {
        int[][] matrix = getValue("input2", int[][].class);
        solution.rotate(matrix);
        assertArrayEquals(
                getValue("output2", int[][].class),
                matrix
        );
    }
}