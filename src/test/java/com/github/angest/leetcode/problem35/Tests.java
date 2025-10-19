package com.github.angest.leetcode.problem35;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void test(int number) {
        assertThat(solution.searchInsert(getValue("input" + number + ".nums", int[].class), getValue("input" + number + ".target", int.class)))
                .isEqualTo(getValue("output" + number, int.class));
    }
}