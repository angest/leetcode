package com.github.angest.leetcode.problem50;

import com.github.angest.leetcode.LeetcodeTests;
import org.assertj.core.data.Percentage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void test(int number) {
        assertThat(solution.myPow(getValue("input" + number + ".x", double.class), getValue("input" + number + ".n", int.class)))
                .isCloseTo(getValue("output" + number, double.class), Percentage.withPercentage(0.0001));
    }
}