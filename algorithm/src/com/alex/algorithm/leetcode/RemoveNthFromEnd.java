package com.alex.algorithm.leetcode;

/**
 * 移除链表中倒数第N个元素
 * @author: gaojun
 * @date: 2025/10/28
 **/
public class RemoveNthFromEnd {

    public static void main(String[] args) {
        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(1, n2);
        removeNthFromEnd(n1, 1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1, head);
        ListNode s = dummyNode, f = dummyNode;
        int firstStep = n;
        while (f.next != null && firstStep > 0) {
            f = f.next;
            --firstStep;
        }
        while (f.next != null) {
            f = f.next;
            s = s.next;
        }
        s.next = s.next != null ? s.next.next : null;
        return dummyNode.next;
    }
}
