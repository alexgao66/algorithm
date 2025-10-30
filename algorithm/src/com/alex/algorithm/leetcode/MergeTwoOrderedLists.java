package com.alex.algorithm.leetcode;

/**
 * 合并两个已排序的链表，仅通过拼接的方式形成新的链表
 * merge two ordered  link list, only by concat the two link list to generate new link list.
 * @author: gaojun
 * @date: 2025/10/22
 **/
public class MergeTwoOrderedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(0);
        ListNode n1 = list1, n2 = list2, cur = dummyNode;
        while(n1 != null && n2 != null) {
            if (n1.val < n2.val) {
                cur.next = n1;
                n1 = n1.next;
            }else {
                cur.next = n2;
                n2 = n2.next;
            }
            cur = cur.next;
        }
        cur.next = n1 != null ? n1 : n2;
        return dummyNode.next;
    }
}
