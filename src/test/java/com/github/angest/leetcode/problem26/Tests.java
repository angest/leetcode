package com.github.angest.leetcode.problem26;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test(int number) {
        int[] nums = getValue("input" + number, int[].class);
        assertThat(solution.removeDuplicates(nums))
                .isEqualTo(getValue("output" + number + ".k", int.class));
        assertThat(nums)
                .containsExactly(getValue("output" + number + ".nums", int[].class));
    }
}