package com.github.angest.leetcode.problem78;

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
                solution.subsets(getValue("input1", int[].class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", new TypeReference<List<List<Integer>>>() {
                }),
                solution.subsets(getValue("input2", int[].class))
        );
    }
}