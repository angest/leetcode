package com.github.angest.leetcode.problem54;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", List.class),
                solution.spiralOrder(getValue("input1", int[][].class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", List.class),
                solution.spiralOrder(getValue("input2", int[][].class))
        );
    }
}