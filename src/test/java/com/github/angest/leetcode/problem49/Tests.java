package com.github.angest.leetcode.problem49;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertListOfListEquals(
                getValue("output1", new TypeReference<List<List<String>>>() {
                }),
                solution.groupAnagrams(getValue("input1", String[].class))
        );
    }

    @Test
    public void tes2() {
        assertListOfListEquals(
                getValue("output2", new TypeReference<List<List<String>>>() {
                }),
                solution.groupAnagrams(getValue("input2", String[].class))
        );
    }

    @Test
    public void tes3() {
        assertListOfListEquals(
                getValue("output3", new TypeReference<List<List<String>>>() {
                }),
                solution.groupAnagrams(getValue("input3", String[].class))
        );
    }
}