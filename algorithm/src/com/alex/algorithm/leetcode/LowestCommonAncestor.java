package com.alex.algorithm.leetcode;

/**
 * leetcode第236题：找到两个节点的最深公共祖先
 * 思路：最深公共祖先的可能出现的情况：1）两个节点分布在两个子树；当前节点等于其中一个节点，两个一个接口分布在当前接口的子树中。
 * 逻辑：
 * 1）通过先序遍历二叉树；
 * 2）如果当前节点为null，或者等于其中任意一个节点，这直接返回该节点；
 * 3）递归遍历左子树，查询左子树对应节点；
 * 4）递归遍历右子树，查询右子树对应节点；
 * 5）如果左子树对应节点不存在，则返回右子树对应节点；
 * 6）如果右子树对应节点不存在，则返回左子树对应节点；
 * 7）否则，返回当前节点。
 *
 * @author: gaojun
 * @date: 2024/3/4
 **/
public class LowestCommonAncestor {

    public static BinaryTreeNode findLowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if (root == null || root.value == p.value || root.value == q.value) {
            return root;
        }
        BinaryTreeNode left = findLowestCommonAncestor(root.left, p, q);
        BinaryTreeNode right = findLowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }

    public static void main(String[] args) {
        System.out.println(findLowestCommonAncestor(buildBinaryTree1(), new BinaryTreeNode(5), new BinaryTreeNode(1)).value);
        System.out.println(findLowestCommonAncestor(buildBinaryTree1(), new BinaryTreeNode(5), new BinaryTreeNode(4)).value);
        System.out.println(findLowestCommonAncestor(buildBinaryTree2(), new BinaryTreeNode(1), new BinaryTreeNode(2)).value);
    }

    private static BinaryTreeNode buildBinaryTree1() {
        BinaryTreeNode n7 = new BinaryTreeNode(7);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        BinaryTreeNode n2 = new BinaryTreeNode(2, n7, n4);
        BinaryTreeNode n6 = new BinaryTreeNode(6);
        BinaryTreeNode n5 = new BinaryTreeNode(5, n6, n2);
        BinaryTreeNode n0 = new BinaryTreeNode(0);
        BinaryTreeNode n8 = new BinaryTreeNode(8);
        BinaryTreeNode n1 = new BinaryTreeNode(1, n0, n8);
        BinaryTreeNode n3 = new BinaryTreeNode(3, n5, n1);
        return n3;
    }
    private static BinaryTreeNode buildBinaryTree2() {
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n1 = new BinaryTreeNode(1, n2, null);
        return n1;
    }
}
