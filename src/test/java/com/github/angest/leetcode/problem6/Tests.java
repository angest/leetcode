package com.github.angest.leetcode.problem6;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", String.class),
                solution.convert(getValue("input1.s", String.class), getValue("input1.numRows", int.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", String.class),
                solution.convert(getValue("input2.s", String.class), getValue("input2.numRows", int.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", String.class),
                solution.convert(getValue("input3.s", String.class), getValue("input3.numRows", int.class))
        );
    }

    @Test
    public void test4() {
        assertEquals(
                getValue("output4", String.class),
                solution.convert(getValue("input4.s", String.class), getValue("input4.numRows", int.class))
        );
    }

    @Test
    public void test5() {
        assertEquals(
                getValue("output5", String.class),
                solution.convert(getValue("input5.s", String.class), getValue("input5.numRows", int.class))
        );
    }
}