package com.github.angest.leetcode.problem19;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", ListNode.class),
                solution.removeNthFromEnd(getValue("input1.head", ListNode.class), getValue("input1.n", int.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", ListNode.class),
                solution.removeNthFromEnd(getValue("input2.head", ListNode.class), getValue("input2.n", int.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", ListNode.class),
                solution.removeNthFromEnd(getValue("input3.head", ListNode.class), getValue("input3.n", int.class))
        );
    }
}