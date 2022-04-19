package com.github.angest.leetcode.problem18;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertListEquals(
                getValue("output1", new TypeReference<List<List<Integer>>>() {
                }),
                solution.fourSum(getValue("input1.nums", int[].class), getValue("input1.target", int.class))
        );
    }

    @Test
    public void test2() {
        assertListEquals(
                getValue("output2", new TypeReference<List<List<Integer>>>() {
                }),
                solution.fourSum(getValue("input2.nums", int[].class), getValue("input2.target", int.class))
        );
    }
}