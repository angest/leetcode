package com.github.angest.leetcode.problem15;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input1", int[].class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input2", int[].class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input3", int[].class))
        );
    }

    @Test
    public void test4() {
        assertEquals(
                getValue("output4", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input4", int[].class))
        );
    }
}