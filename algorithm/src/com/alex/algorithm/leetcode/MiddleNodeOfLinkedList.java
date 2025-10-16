package com.alex.algorithm.leetcode;

/**
 * leetCode的876题：返回链表的中间节点，如果有两个中间节点（链表节点总数为偶数）时，则返回中间的第二个节点
 * 解题思路：使用快慢指针，具体逻辑：
 * 1）定义个slow和fast节点，两个节点初始状态时都指向头节点
 * 2）判断fast节点以及fast的下一个节点均不为null，此时slow移动一位，fast移动两位；否则，此时slow指向的就是目标节点，直接返回；
 *
 * !!! 难点：1）如何证明这样移动完之后slow就居中了？2）终止条件的选择：是判断fast的next，还是判断fast的next的next，需要画图判断
 *
 * @author: gaojun
 * @date: 2024/3/4
 **/
public class MiddleNodeOfLinkedList {

    public static ListNode findMiddleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        testByOddNum();
        testByEvenNum();
    }

    private static void testByOddNum() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(3);
        n2.next = n3;
        ListNode n4 = new ListNode(4);
        n3.next = n4;
        ListNode n5 = new ListNode(5);
        n4.next = n5;
        System.out.println("Odd LinkNode:" + n1);
        System.out.println("testByOddNum:" + findMiddleNode(n1));
    }

    private static void testByEvenNum() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(3);
        n2.next = n3;
        ListNode n4 = new ListNode(4);
        n3.next = n4;
        ListNode n5 = new ListNode(5);
        n4.next = n5;
        ListNode n6 = new ListNode(6);
        n5.next = n6;
        System.out.println("even LinkNode:" + n1);
        System.out.println("testByEvenNum:" + findMiddleNode(n1));
    }
}
