package com.github.angest.leetcode.problem17;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test(int number) {
        assertThat(solution.letterCombinations(getValue("input" + number, String.class)))
                .containsExactlyElementsOf(getValue("output" + number, new TypeReference<List<String>>() {
                }));
    }
}