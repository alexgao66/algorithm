package com.alex.algorithm.leetcode;

/**
 * @author: gaojun
 * @date: 2025/9/29
 **/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode cur = null, pre = head;
        while (pre != null) {
            ListNode n = pre.next;
            pre.next = cur;
            cur = pre;
            pre = n;
        }
        return cur;
    }
}
