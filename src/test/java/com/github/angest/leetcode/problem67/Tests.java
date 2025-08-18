package com.github.angest.leetcode.problem67;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", String.class),
                solution.addBinary(getValue("input1.a", String.class), getValue("input1.b", String.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", String.class),
                solution.addBinary(getValue("input2.a", String.class), getValue("input2.b", String.class))
        );
    }
}