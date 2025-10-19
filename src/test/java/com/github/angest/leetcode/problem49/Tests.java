package com.github.angest.leetcode.problem49;

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
        assertThat(solution.groupAnagrams(getValue("input" + number, String[].class)))
                .usingRecursiveComparison()
                .ignoringCollectionOrder()
                .isEqualTo(getValue("output" + number, new TypeReference<List<List<String>>>() {
                }));
    }
}