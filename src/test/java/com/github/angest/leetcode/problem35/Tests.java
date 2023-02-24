package com.github.angest.leetcode.problem35;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", int.class),
                solution.searchInsert(getValue("input1.nums", int[].class), getValue("input1.target", int.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", int.class),
                solution.searchInsert(getValue("input2.nums", int[].class), getValue("input2.target", int.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", int.class),
                solution.searchInsert(getValue("input3.nums", int[].class), getValue("input3.target", int.class))
        );
    }

    @Test
    public void test4() {
        assertEquals(
                getValue("output4", int.class),
                solution.searchInsert(getValue("input4.nums", int[].class), getValue("input4.target", int.class))
        );
    }
}