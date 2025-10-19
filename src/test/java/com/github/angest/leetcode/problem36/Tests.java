package com.github.angest.leetcode.problem36;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void test(int number) {
        assertThat(solution.isValidSudoku(getValue("input" + number, char[][].class)))
                .isEqualTo(getValue("output" + number, boolean.class));
    }
}