package com.github.angest.leetcode.problem75;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void test(int number) {
        int[] nums = getValue("input" + number, int[].class);
        solution.sortColors(nums);
        assertThat(nums)
                .containsExactly(getValue("output" + number, int[].class));
    }
}