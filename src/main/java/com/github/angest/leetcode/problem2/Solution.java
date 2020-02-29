package com.github.angest.leetcode.problem2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode curr = null;
        boolean add1 = false;

        while (l1 != null || l2 != null) {
            if (curr == null) {
                curr = new ListNode(0);
                result = curr;
            } else {
                curr.next = new ListNode(0);
                curr = curr.next;
            }
            if (l1 != null) {
                curr.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                curr.val += l2.val;
                l2 = l2.next;
            }
            if (add1) {
                curr.val++;
                add1 = false;
            }
            if (curr.val > 9) {
                curr.val -= 10;
                add1 = true;
            }
        }

        if (add1) {
            curr.next = new ListNode(1);
        }

        return result;
    }
}