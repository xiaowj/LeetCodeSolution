package com.github.xiowj;

public class Solution141 {
    public boolean hasCycle(ListNode head) {
        ListNode i = head;
        ListNode j = head;
        while (true) {
            if (i == null || j == null || i.next == null || j.next == null) {
                return false;
            } else {
                i = i.next;
                j = j.next.next;
                if (i == j) {
                    return true;
                }
            }
        }
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
