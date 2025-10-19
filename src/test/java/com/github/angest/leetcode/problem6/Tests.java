package com.github.angest.leetcode.problem6;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void test(int number) {
        assertThat(solution.convert(getValue("input" + number + ".s", String.class), getValue("input" + number + ".numRows", int.class)))
                .isEqualTo(getValue("output" + number, String.class));
    }
}