package com.github.angest.leetcode.problem29;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    void test(int number) {
        assertThat(solution.divide(getValue("input" + number + ".dividend", int.class), getValue("input" + number + ".divisor", int.class)))
                .isEqualTo(getValue("output" + number, int.class));
    }
}