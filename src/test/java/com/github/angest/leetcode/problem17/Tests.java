package com.github.angest.leetcode.problem17;

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
                solution.letterCombinations(getValue("input1", String.class))
        );
    }

    @Test
    public void test2() {
        assertListEquals(
                getValue("output2", new TypeReference<List<String>>() {
                }),
                solution.letterCombinations(getValue("input2", String.class))
        );
    }

    @Test
    public void test3() {
        assertListEquals(
                getValue("output3", new TypeReference<List<String>>() {
                }),
                solution.letterCombinations(getValue("input3", String.class))
        );
    }
}