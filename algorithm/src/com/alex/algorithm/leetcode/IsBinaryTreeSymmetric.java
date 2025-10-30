package com.alex.algorithm.leetcode;

/**
 * 检查二叉树是否对称：左右节点相等，且左节点左子树的右节点的右子树，左节点的右紫薯等于右节点的左子树
 * @author: gaojun
 * @date: 2025/10/28
 **/
public class IsBinaryTreeSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return checkLeftAndRight(root.left, root.right);
    }

    private boolean checkLeftAndRight(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && checkLeftAndRight(left.left, right.right)
                && checkLeftAndRight(left.right, right.left);
    }
}
