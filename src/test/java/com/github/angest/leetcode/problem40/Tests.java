package com.github.angest.leetcode.problem40;

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
                solution.combinationSum2(getValue("input1.candidates", int[].class), getValue("input1.target", int.class))
        );
    }

    @Test
    public void test2() {
        assertListEquals(
                getValue("output2", new TypeReference<List<List<Integer>>>() {
                }),
                solution.combinationSum2(getValue("input2.candidates", int[].class), getValue("input2.target", int.class))
        );
    }

    @Test
    public void test3() {
        assertListEquals(
                getValue("output3", new TypeReference<List<List<Integer>>>() {
                }),
                solution.combinationSum2(getValue("input3.candidates", int[].class), getValue("input3.target", int.class))
        );
    }
}