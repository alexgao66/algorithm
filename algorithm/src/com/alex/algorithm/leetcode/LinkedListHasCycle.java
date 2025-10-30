package com.alex.algorithm.leetcode;

/**
 * 判断链表是否存在环状（尾部节点的next指向了之前的某个节点）
 * 解决思路：
 * 1）使用快慢指针，快指针每次走两步，慢指针每次走一步；
 * 2）快指针走完后，判断快指针指向的节点是否==慢指针指向的节点，如果相等，则有环状，结束；
 * 3）如果快指针指向了null，则没有环状，结束。
 *
 * @author: gaojun
 * @date: 2025/10/16
 **/
public class LinkedListHasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            if (fast == slow) {
                return true;
            }
            slow = slow.next;
        }
        return false;
    }
}
