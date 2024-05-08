package com.github.angest.leetcode.problem50;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                Math.round(getValue("output1", double.class) * 10000),
                Math.round(solution.myPow(getValue("input1.x", double.class), getValue("input1.n", int.class)) * 10000)
        );
    }

    @Test
    public void test2() {
        assertEquals(
                Math.round(getValue("output2", double.class) * 10000),
                Math.round(solution.myPow(getValue("input2.x", double.class), getValue("input2.n", int.class)) * 10000)
        );
    }

    @Test
    public void test3() {
        assertEquals(
                Math.round(getValue("output3", double.class) * 10000),
                Math.round(solution.myPow(getValue("input3.x", double.class), getValue("input3.n", int.class)) * 10000)
        );
    }

    @Test
    public void test4() {
        assertEquals(
                Math.round(getValue("output4", double.class) * 10000),
                Math.round(solution.myPow(getValue("input4.x", double.class), getValue("input4.n", int.class)) * 10000)
        );
    }
}