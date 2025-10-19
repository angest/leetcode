package com.github.angest.leetcode.problem34;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void test(int number) {
        assertThat(solution.searchRange(getValue("input" + number + ".nums", int[].class), getValue("input" + number + ".target", int.class)))
                .containsExactly(getValue("output" + number, int[].class));
    }
}