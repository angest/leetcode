package com.github.angest.leetcode.problem15;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void test(int number) {
        assertThat(solution.threeSum(getValue("input" + number, int[].class)))
                .containsExactlyInAnyOrderElementsOf(getValue("output" + number, new TypeReference<List<List<Integer>>>() {
                }));
    }
}