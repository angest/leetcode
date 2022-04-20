package com.github.angest.leetcode.problem20;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", boolean.class),
                solution.isValid(getValue("input1", String.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", boolean.class),
                solution.isValid(getValue("input2", String.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", boolean.class),
                solution.isValid(getValue("input3", String.class))
        );
    }

    @Test
    public void test4() {
        assertEquals(
                getValue("output4", boolean.class),
                solution.isValid(getValue("input4", String.class))
        );
    }
}