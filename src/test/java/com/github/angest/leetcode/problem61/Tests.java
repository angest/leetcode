package com.github.angest.leetcode.problem61;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test(int number) {
        assertThat(solution.rotateRight(getValue("input" + number + ".head", ListNode.class), getValue("input" + number + ".k", int.class)))
                .isEqualTo(getValue("output" + number, ListNode.class));
    }
}