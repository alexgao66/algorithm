package com.alex.algorithm.leetcode;

/**
 * Definition for a binary tree node.
 * @author: gaojun
 * @date: 2025/10/16
 **/
public class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
