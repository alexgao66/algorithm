package com.alex.algorithm.leetcode;

/**
 * 将以链表形式组装起来的两个非负数相加，并以相同的链表形式返回其和
 * 234对应的链表形式：4->3->2
 * @author: gaojun
 * @date: 2025/10/22
 **/
public class AddTwoNumbersFormedByLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode n1 = l1, n2 = l2, current = dummy;
        int carry = 0;
        while (n1 != null || n2 != null) {
            int v1 = n1 == null ? 0 : n1.val;
            int v2 = n2 == null ? 0 : n2.val;
            int sum = v1 + v2 + carry;
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if (n1 != null) {
                n1 = n1.next;
            }
            if (n2 != null) {
                n2 = n2.next;
            }
        }
        if (carry != 0) {
            current.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
