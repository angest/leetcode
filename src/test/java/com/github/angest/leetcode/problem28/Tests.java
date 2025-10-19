package com.github.angest.leetcode.problem28;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void test(int number) {
        assertThat(solution.strStr(getValue("input" + number + ".haystack", String.class), getValue("input" + number + ".needle", String.class)))
                .isEqualTo(getValue("output" + number, int.class));
    }
}