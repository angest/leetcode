package com.github.angest.leetcode.problem29;

import com.github.angest.leetcode.LeetcodeTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests extends LeetcodeTests {
    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(
                getValue("output1", int.class),
                solution.divide(getValue("input1.dividend", int.class), getValue("input1.divisor", int.class))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                getValue("output2", int.class),
                solution.divide(getValue("input2.dividend", int.class), getValue("input2.divisor", int.class))
        );
    }

    @Test
    public void test3() {
        assertEquals(
                getValue("output3", int.class),
                solution.divide(getValue("input3.dividend", int.class), getValue("input3.divisor", int.class))
        );
    }

    @Test
    public void test4() {
        assertEquals(
                getValue("output4", int.class),
                solution.divide(getValue("input4.dividend", int.class), getValue("input4.divisor", int.class))
        );
    }

    @Test
    public void test5() {
        assertEquals(
                getValue("output5", int.class),
                solution.divide(getValue("input5.dividend", int.class), getValue("input5.divisor", int.class))
        );
    }

    @Test
    public void test6() {
        assertEquals(
                getValue("output6", int.class),
                solution.divide(getValue("input6.dividend", int.class), getValue("input6.divisor", int.class))
        );
    }

    @Test
    public void test7() {
        assertEquals(
                getValue("output7", int.class),
                solution.divide(getValue("input7.dividend", int.class), getValue("input7.divisor", int.class))
        );
    }

    @Test
    public void test8() {
        assertEquals(
                getValue("output8", int.class),
                solution.divide(getValue("input8.dividend", int.class), getValue("input8.divisor", int.class))
        );
    }

    @Test
    public void test9() {
        assertEquals(
                getValue("output9", int.class),
                solution.divide(getValue("input9.dividend", int.class), getValue("input9.divisor", int.class))
        );
    }

    @Test
    public void test10() {
        assertEquals(
                getValue("output10", int.class),
                solution.divide(getValue("input10.dividend", int.class), getValue("input10.divisor", int.class))
        );
    }
}