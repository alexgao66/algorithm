package com.alex.algorithm.leetcode;

/**
 * 找到链表的入环节点
 * @author: gaojun
 * @date: 2025/10/16
 **/
public class DetectLinkedListCycle {

    public static ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        boolean hasCycle = false;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }else {
                return null;
            }
            if (fast == slow) {
                hasCycle = true;
                break;
            }
            slow = slow.next;
        }
        ListNode detectNode = head;
        if (hasCycle) {
            while(detectNode != slow) {
                detectNode = detectNode.next;
                slow = slow.next;
            }
            return detectNode;
        }
        return null;
    }
}
