package com.github.angest.leetcode.problem27;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums = getValue("input1.nums", int[].class);
        int val = getValue("input1.val", int.class);
        int k = solution.removeElement(nums, val);
        int[] expectedNums = getValue("output1.nums", int[].class);
        Arrays.sort(nums);
        Arrays.sort(expectedNums);
        assertEquals(getValue("output1.k", int.class), k);
        assertArrayEquals(expectedNums, nums);
    }

    @Test
    public void test2() {
        int[] nums = getValue("input2.nums", int[].class);
        int val = getValue("input2.val", int.class);
        int k = solution.removeElement(nums, val);
        int[] expectedNums = getValue("output2.nums", int[].class);
        Arrays.sort(nums);
        Arrays.sort(expectedNums);
        assertEquals(getValue("output2.k", int.class), k);
        assertArrayEquals(expectedNums, nums);
    }
}