package com.github.angest.leetcode.problem24;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode();
        ListNode prev = root;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            if (curr.next != null) {
                next = curr.next.next;
                prev.next = curr.next;
                prev.next.next = curr;
                prev = curr;
                prev.next = null;
                curr = next;
            } else {
                prev.next = curr;
                prev = curr;
                curr = null;
            }
        }

        return root.next;
    }
}