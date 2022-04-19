package com.github.angest.leetcode.problem19;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = new ListNode();
        root.next = head;

        List<ListNode> nodes = new ArrayList<>();
        ListNode node = root;
        while (node != null) {
            nodes.add(node);
            node = node.next;
        }
        nodes.add(null);

        nodes.get(nodes.size() - n - 2).next = nodes.get(nodes.size() - n);
        return root.next;
    }
}