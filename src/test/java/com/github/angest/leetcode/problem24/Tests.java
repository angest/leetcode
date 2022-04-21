package com.github.angest.leetcode.problem24;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", ListNode.class),
                solution.swapPairs(getValue("input1", ListNode.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", ListNode.class),
                solution.swapPairs(getValue("input2", ListNode.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", ListNode.class),
                solution.swapPairs(getValue("input3", ListNode.class))
        );
    }
}