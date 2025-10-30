package com.alex.algorithm.leetcode;

/**
 * 将二叉树的左右节点进行对换
 * @author: gaojun
 * @date: 2025/10/22
 **/
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode leftNode  = root.left;
        root.left = root.right;
        root.right = leftNode;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
