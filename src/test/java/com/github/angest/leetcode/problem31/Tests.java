package com.github.angest.leetcode.problem31;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void test(int number) {
        int[] nums = getValue("input" + number, int[].class);
        solution.nextPermutation(nums);
        assertThat(nums)
                .containsExactly(getValue("output" + number, int[].class));
    }
}