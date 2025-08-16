package com.github.angest.leetcode.problem61;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", ListNode.class),
                solution.rotateRight(getValue("input1.head", ListNode.class), getValue("input1.k", int.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", ListNode.class),
                solution.rotateRight(getValue("input2.head", ListNode.class), getValue("input2.k", int.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", ListNode.class),
                solution.rotateRight(getValue("input3.head", ListNode.class), getValue("input3.k", int.class))
        );
    }
}