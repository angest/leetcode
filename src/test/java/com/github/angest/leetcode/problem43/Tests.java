package com.github.angest.leetcode.problem43;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", String.class),
                solution.multiply(getValue("input1.num1", String.class), getValue("input1.num2", String.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", String.class),
                solution.multiply(getValue("input2.num1", String.class), getValue("input2.num2", String.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", String.class),
                solution.multiply(getValue("input3.num1", String.class), getValue("input3.num2", String.class))
        );
    }
}