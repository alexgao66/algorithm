package com.alex.algorithm.leetcode;

/**
 * 链表通用节点
 * @author: gaojun
 * @date: 2024/3/4
 **/
public class ListNode {

     Integer val;

    ListNode next;

    public ListNode(Integer val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(Integer val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "value=" + val +
                ", next=" + next +
                '}';
    }
}
