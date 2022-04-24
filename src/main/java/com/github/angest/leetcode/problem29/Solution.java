package com.github.angest.leetcode.problem29;

public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == Integer.MIN_VALUE) {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }
        if (dividend != Integer.MIN_VALUE && Math.abs(dividend) < Math.abs(divisor)) {
            return 0;
        }
        if (divisor == 1) {
            return dividend;
        }

        boolean positive = true;
        if (divisor < 0) {
            positive = false;
            divisor = -divisor;
        }

        boolean max = dividend == Integer.MAX_VALUE;
        boolean min = dividend == Integer.MIN_VALUE;
        if (max) {
            dividend = dividend - divisor;
        }
        if (min) {
            dividend = dividend + divisor;
        }

        if (dividend < 0) {
            positive = !positive;
            dividend = -dividend;
        }

        int left = 0;
        int right = 1;
        int leftResult = 0;
        int rightResult = divisor;

        while (left < right) {
            int compareRight = compareResult(dividend, divisor, rightResult);
            if (compareRight == 0) {
                return result(right, positive, max, min);
            }
            if (compareRight < 0) {
                left = right;
                leftResult = rightResult;
                int plus = 1;
                int plusResult = divisor;
                while (rightResult + plusResult + plusResult > 0) {
                    plus = plus + plus;
                    plusResult = plusResult + plusResult;
                }

                right = right + plus;
                rightResult = rightResult + plusResult;

                continue;
            }
            // compareRight > 0
            int middle = (left + right) >> 1;
            int middleResult = (leftResult >> 1) + (rightResult >> 1);
            int compareMiddle = compareResult(dividend, divisor, middleResult);
            if (compareMiddle == 0) {
                return result(middle, positive, max, min);
            }
            if (compareMiddle < 0) {
                left = middle;
                leftResult = middleResult;
                continue;
            }
            // compareMiddle > 0
            right = middle;
            rightResult = middleResult;
        }

        return result(left, positive, max, min);
    }

    private int compareResult(int dividend, int divisor, int result) {
        if (result > dividend) {
            return 1;
        }
        if (result <= dividend - divisor) {
            return -1;
        }

        return 0;
    }

    private int result(int result, boolean positive, boolean max, boolean min) {
        if (positive) {
            if (max || min) {
                if (result < Integer.MAX_VALUE) {
                    result++;
                }
            }
            return result;
        } else {
            result = -result;
            if (max || min) {
                result--;
            }
            return result;
        }
    }
}