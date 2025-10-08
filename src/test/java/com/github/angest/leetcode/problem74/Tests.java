package com.github.angest.leetcode.problem74;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", boolean.class),
                solution.searchMatrix(getValue("input1.matrix", int[][].class), getValue("input1.target", int.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", boolean.class),
                solution.searchMatrix(getValue("input2.matrix", int[][].class), getValue("input2.target", int.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", boolean.class),
                solution.searchMatrix(getValue("input3.matrix", int[][].class), getValue("input3.target", int.class))
        );
    }
}