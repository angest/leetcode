package com.github.angest.leetcode.problem72;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test(int number) {
        assertThat(solution.minDistance(getValue("input" + number + ".word1", String.class), getValue("input" + number + ".word2", String.class)))
                .isEqualTo(getValue("output" + number, int.class));
    }
}