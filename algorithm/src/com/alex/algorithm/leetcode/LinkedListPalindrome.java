package com.alex.algorithm.leetcode;

/**
 * 判断一个链表是否是回文结构
 * 1.使用快慢指针找到链表的中间节点（慢指针每次只走1步，快指针每次走2步）
 * 2.从中间节点逆转链表，得到后半部分逆转链表头
 * 3.从head和逆转链表头开始，依次判断每个节点的值是否相等，如果有不相等的情况，则返回false，如果能一直遍历到结束，则返回true。
 * 4.将后半部分链表再次逆转以还原。
 * @author: gaojun
 * @date: 2025/10/16
 **/
public class LinkedListPalindrome {

    public static void main(String[] args) {
        ListNode h4 = new ListNode(1, null);
        ListNode h3 = new ListNode(2, h4);
        ListNode h2 = new ListNode(2, h3);
        ListNode head = new ListNode(1,h2);
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode preHalfNode = getHalfNode(head);
        ListNode reversedHalfHeadNode = reverseLinkedList(preHalfNode.next);

        boolean result = true;
        ListNode p1 = head;
        ListNode p2 = reversedHalfHeadNode;
        while(result && p2 != null) {
            if (!p1.val.equals(p2.val)){
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        reverseLinkedList(reversedHalfHeadNode);
        return result;
    }

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    private static ListNode getHalfNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow.next != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
