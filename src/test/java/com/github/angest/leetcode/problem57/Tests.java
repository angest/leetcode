package com.github.angest.leetcode.problem57;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void test(int number) {
        assertThat(solution.insert(getValue("input" + number + ".intervals", int[][].class), getValue("input" + number + ".newInterval", int[].class)))
                .isEqualTo(getValue("output" + number, int[][].class));
    }
}