package com.github.angest.leetcode.problem61;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        List<ListNode> listNodes = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            listNodes.add(node);
            node = node.next;
        }
        if (listNodes.size() < 2) {
            return head;
        }
        k = k % listNodes.size();
        if (k == 0) {
            return head;
        }
        listNodes.get(listNodes.size() - 1).next = head;
        listNodes.get(listNodes.size() - k - 1).next = null;
        return listNodes.get(listNodes.size() - k);
    }
}