package com.github.angest.leetcode.problem28;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", int.class),
                solution.strStr(getValue("input1.haystack", String.class), getValue("input1.needle", String.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", int.class),
                solution.strStr(getValue("input2.haystack", String.class), getValue("input2.needle", String.class))
        );
    }
}