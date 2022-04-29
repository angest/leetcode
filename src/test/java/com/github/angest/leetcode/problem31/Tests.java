package com.github.angest.leetcode.problem31;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums = getValue("input1", int[].class);
        solution.nextPermutation(nums);
        assertArrayEquals(nums, getValue("output1", int[].class));
    }

    @Test
    public void test2() {
        int[] nums = getValue("input2", int[].class);
        solution.nextPermutation(nums);
        assertArrayEquals(nums, getValue("output2", int[].class));
    }

    @Test
    public void test3() {
        int[] nums = getValue("input3", int[].class);
        solution.nextPermutation(nums);
        assertArrayEquals(nums, getValue("output3", int[].class));
    }

    @Test
    public void test4() {
        int[] nums = getValue("input4", int[].class);
        solution.nextPermutation(nums);
        assertArrayEquals(nums, getValue("output4", int[].class));
    }
}