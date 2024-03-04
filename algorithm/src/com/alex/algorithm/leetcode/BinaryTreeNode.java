package com.alex.algorithm.leetcode;

/**
 * 二叉树通用节点
 *
 * @author: gaojun
 * @date: 2024/3/4
 **/
public class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
