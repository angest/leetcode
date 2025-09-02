package com.github.angest.leetcode.problem71;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", String.class),
                solution.simplifyPath(getValue("input1", String.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", String.class),
                solution.simplifyPath(getValue("input2", String.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", String.class),
                solution.simplifyPath(getValue("input3", String.class))
        );
    }

    @Test
    public void test4() {
        assertEquals(
                getValue("output4", String.class),
                solution.simplifyPath(getValue("input4", String.class))
        );
    }

    @Test
    public void test5() {
        assertEquals(
                getValue("output5", String.class),
                solution.simplifyPath(getValue("input5", String.class))
        );
    }

    @Test
    public void test6() {
        assertEquals(
                getValue("output6", String.class),
                solution.simplifyPath(getValue("input6", String.class))
        );
    }
}