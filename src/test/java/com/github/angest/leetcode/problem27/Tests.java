package com.github.angest.leetcode.problem27;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void test(int number) {
        int[] nums = getValue("input" + number + ".nums", int[].class);
        assertThat(solution.removeElement(nums, getValue("input" + number + ".val", int.class)))
                .isEqualTo(getValue("output" + number + ".k", int.class));
        assertThat(nums)
                .containsExactlyInAnyOrder(getValue("output" + number + ".nums", int[].class));
    }
}