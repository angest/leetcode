package com.github.angest.leetcode.problem2;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class Tests extends LeetcodeTests {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1})
    void test(int number) {
        assertThat(solution.addTwoNumbers(getValue("input" + number + ".l1", ListNode.class), getValue("input" + number + ".l2", ListNode.class)))
                .isEqualTo(getValue("output" + number, ListNode.class));
    }
}