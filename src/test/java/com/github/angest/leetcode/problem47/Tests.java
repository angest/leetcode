package com.github.angest.leetcode.problem47;

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
                solution.permuteUnique(getValue("input1", int[].class))
        );
    }

    @Test
    public void test2() {
        assertListEquals(
                getValue("output2", new TypeReference<List<List<Integer>>>() {
                }),
                solution.permuteUnique(getValue("input2", int[].class))
        );
    }

    @Test
    public void test3() {
        assertListEquals(
                getValue("output3", new TypeReference<List<List<Integer>>>() {
                }),
                solution.permuteUnique(getValue("input3", int[].class))
        );
    }

    @Test
    public void test4() {
        assertListEquals(
                getValue("output4", new TypeReference<List<List<Integer>>>() {
                }),
                solution.permuteUnique(getValue("input4", int[].class))
        );
    }
}