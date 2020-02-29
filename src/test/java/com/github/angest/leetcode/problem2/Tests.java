package com.github.angest.leetcode.problem2;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", ListNode.class),
                solution.addTwoNumbers(getValue("input1.l1", ListNode.class), getValue("input1.l2", ListNode.class))
        );
    }
}