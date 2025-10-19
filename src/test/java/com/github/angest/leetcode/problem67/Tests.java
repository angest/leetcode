package com.github.angest.leetcode.problem67;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void test(int number) {
        assertThat(solution.addBinary(getValue("input" + number + ".a", String.class), getValue("input" + number + ".b", String.class)))
                .isEqualTo(getValue("output" + number, String.class));
    }
}