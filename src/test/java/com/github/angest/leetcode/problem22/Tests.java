package com.github.angest.leetcode.problem22;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertListEquals(
                getValue("output1", new TypeReference<List<String>>() {
                }),
                solution.generateParenthesis(getValue("input1", int.class))
        );
    }

    @Test
    public void test2() {
        assertListEquals(
                getValue("output2", new TypeReference<List<String>>() {
                }),
                solution.generateParenthesis(getValue("input2", int.class))
        );
    }
}