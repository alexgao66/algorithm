package com.alex.algorithm.leetcode;

/**
 * 链表通用节点
 * @author: gaojun
 * @date: 2024/3/4
 **/
public class LinkNode {

    private Integer value;

    LinkNode next;

    public LinkNode(Integer value, LinkNode next) {
        this.value = value;
        this.next = next;
    }

    public LinkNode(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
