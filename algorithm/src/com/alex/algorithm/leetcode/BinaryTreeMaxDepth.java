package com.alex.algorithm.leetcode;

/**
 * 最大深度
 * @author: gaojun
 * @date: 2025/10/16
 **/
public class BinaryTreeMaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }

}
