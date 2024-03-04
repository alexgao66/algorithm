package com.alex.algorithm.leetcode;

/**
 * leetCode的876题：返回链表的中间节点，如果有两个中间节点（链表节点总数为偶数）时，则返回中间的第二个节点
 * 解题思路：使用快慢指针，具体逻辑：
 * 1）定义个slow和fast节点，两个节点初始状态时都指向头节点
 * 2）判断fast节点以及fast的下一个节点均不为null，此时slow移动一位，fast移动两位；否则，此时slow指向的就是目标节点，直接返回；
 *
 * @author: gaojun
 * @date: 2024/3/4
 **/
public class MiddleNodeOfLinkedList {

    public static LinkNode findMiddleNode(LinkNode head) {
        if (head == null) {
            return null;
        }
        LinkNode slow = head;
        LinkNode fast = head;
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
        LinkNode n1 = new LinkNode(1);
        LinkNode n2 = new LinkNode(2);
        n1.next = n2;
        LinkNode n3 = new LinkNode(3);
        n2.next = n3;
        LinkNode n4 = new LinkNode(4);
        n3.next = n4;
        LinkNode n5 = new LinkNode(5);
        n4.next = n5;
        System.out.println("Odd LinkNode:" + n1);
        System.out.println("testByOddNum:" + findMiddleNode(n1));
    }

    private static void testByEvenNum() {
        LinkNode n1 = new LinkNode(1);
        LinkNode n2 = new LinkNode(2);
        n1.next = n2;
        LinkNode n3 = new LinkNode(3);
        n2.next = n3;
        LinkNode n4 = new LinkNode(4);
        n3.next = n4;
        LinkNode n5 = new LinkNode(5);
        n4.next = n5;
        LinkNode n6 = new LinkNode(6);
        n5.next = n6;
        System.out.println("even LinkNode:" + n1);
        System.out.println("testByEvenNum:" + findMiddleNode(n1));
    }
}
