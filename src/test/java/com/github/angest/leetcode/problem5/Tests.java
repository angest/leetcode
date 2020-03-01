package com.github.angest.leetcode.problem5;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertTrue(
                getValue("output1", new TypeReference<List<String>>() {
                }).contains(solution.longestPalindrome(getValue("input1", String.class)))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", String.class),
                solution.longestPalindrome(getValue("input2", String.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", String.class),
                solution.longestPalindrome(getValue("input3", String.class))
        );
    }

    @Test
    public void test4() {
        assertEquals(
                getValue("output4", String.class),
                solution.longestPalindrome(getValue("input4", String.class))
        );
    }

    @Test
    public void test5() {
        assertTrue(
                getValue("output5", new TypeReference<List<String>>() {
                }).contains(solution.longestPalindrome(getValue("input5", String.class)))
        );
    }
}