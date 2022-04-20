package com.github.angest.leetcode.problem21;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode curr = root;
        while (list1 != null || list2 != null) {
            curr.next = new ListNode();
            curr = curr.next;
            if (list1 != null && (list2 == null || list1.val <= list2.val)) {
                curr.val = list1.val;
                list1 = list1.next;
            } else {
                curr.val = list2.val;
                list2 = list2.next;
            }
        }

        return root.next;
    }
}