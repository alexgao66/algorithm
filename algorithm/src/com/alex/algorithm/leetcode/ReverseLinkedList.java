package com.alex.algorithm.leetcode;

/**
 * @author: gaojun
 * @date: 2025/9/29
 **/
public class ReverseLinkedList {
    public LinkNode reverseList(LinkNode head) {
        LinkNode cur = null, pre = head;
        while (pre != null) {
            LinkNode n = pre.next;
            pre.next = cur;
            cur = pre;
            pre = n;
        }
        return cur;
    }
}
