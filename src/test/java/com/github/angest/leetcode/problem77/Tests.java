package com.github.angest.leetcode.problem77;

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
                solution.combine(getValue("input1.n", int.class), getValue("input1.k", int.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", new TypeReference<List<List<Integer>>>() {
                }),
                solution.combine(getValue("input2.n", int.class), getValue("input2.k", int.class))
        );
    }
}