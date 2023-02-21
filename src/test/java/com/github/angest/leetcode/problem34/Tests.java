package com.github.angest.leetcode.problem34;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertArrayEquals(
                getValue("output1", int[].class),
                solution.searchRange(getValue("input1.nums", int[].class), getValue("input1.target", int.class))
        );
    }

    @Test
    public void test2() {
        assertArrayEquals(
                getValue("output2", int[].class),
                solution.searchRange(getValue("input2.nums", int[].class), getValue("input2.target", int.class))
        );
    }

    @Test
    public void test3() {
        assertArrayEquals(
                getValue("output3", int[].class),
                solution.searchRange(getValue("input3.nums", int[].class), getValue("input3.target", int.class))
        );
    }

    @Test
    public void test4() {
        assertArrayEquals(
                getValue("output4", int[].class),
                solution.searchRange(getValue("input4.nums", int[].class), getValue("input4.target", int.class))
        );
    }
}