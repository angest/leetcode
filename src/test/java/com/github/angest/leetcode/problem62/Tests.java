package com.github.angest.leetcode.problem62;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", int.class),
                solution.uniquePaths(getValue("input1.m", int.class), getValue("input1.n", int.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", int.class),
                solution.uniquePaths(getValue("input2.m", int.class), getValue("input2.n", int.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", int.class),
                solution.uniquePaths(getValue("input3.m", int.class), getValue("input3.n", int.class))
        );
    }
}