package com.alex.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树中序遍历
 * @author: gaojun
 * @date: 2025/10/16
 **/
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        getInorderList(root, inorderList);
        return inorderList;
    }

    private void getInorderList(TreeNode root, List<Integer> inorderValueList) {
        if (root == null) {
            return;
        }
        getInorderList(root.left, inorderValueList);
        inorderValueList.add(root.val);
        getInorderList(root.right, inorderValueList);
    }
}
