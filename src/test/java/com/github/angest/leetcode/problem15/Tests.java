package com.github.angest.leetcode.problem15;

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
                solution.threeSum(getValue("input1", int[].class))
        );
    }

    @Test
    public void test2() {
        assertListEquals(
                getValue("output2", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input2", int[].class))
        );
    }

    @Test
    public void test3() {
        assertListEquals(
                getValue("output3", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input3", int[].class))
        );
    }

    @Test
    public void test4() {
        assertListEquals(
                getValue("output4", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input4", int[].class))
        );
    }

    @Test
    public void test5() {
        assertListEquals(
                getValue("output5", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input5", int[].class))
        );
    }

    @Test
    public void test6() {
        assertListEquals(
                getValue("output6", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input6", int[].class))
        );
    }

    @Test
    public void test7() {
        assertListEquals(
                getValue("output7", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input7", int[].class))
        );
    }

    @Test
    public void test8() {
        assertListEquals(
                getValue("output8", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input8", int[].class))
        );
    }

    @Test
    public void test9() {
        assertListEquals(
                getValue("output9", new TypeReference<List<List<Integer>>>() {
                }),
                solution.threeSum(getValue("input9", int[].class))
        );
    }
}