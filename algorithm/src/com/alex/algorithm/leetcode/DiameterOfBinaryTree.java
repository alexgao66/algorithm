package com.alex.algorithm.leetcode;

public class DiameterOfBinaryTree {
    int answer;
    public int diameterOfBinaryTree(TreeNode root) {
        answer = 1;
        depth(root);
        return answer - 1;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        answer = Math.max(answer, l + r + 1);
        return Math.max(l, r) + 1;
    }
}
