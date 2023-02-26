package com.github.angest.leetcode.problem36;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", boolean.class),
                solution.isValidSudoku(getValue("input1", char[][].class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", boolean.class),
                solution.isValidSudoku(getValue("input2", char[][].class))
        );
    }
}