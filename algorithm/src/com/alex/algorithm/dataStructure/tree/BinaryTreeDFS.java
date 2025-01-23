package com.alex.algorithm.dataStructure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 深度优先遍历，先向下递推，再向上回溯
 */
public class BinaryTreeDFS {

    public static void main(String[] args) {
        BinaryTree.Node node4 = new BinaryTree.Node(4, null,null);
        BinaryTree.Node node5 = new BinaryTree.Node(5, null,null);
        BinaryTree.Node node2 = new BinaryTree.Node(2, node4,node5);

        BinaryTree.Node node6 = new BinaryTree.Node(6, null,null);
        BinaryTree.Node node7 = new BinaryTree.Node(7, null,null);
        BinaryTree.Node node3 = new BinaryTree.Node(3, node6,node7);

        BinaryTree.Node node1 = new BinaryTree.Node(1, node2,node3);

        System.out.println(node1);
        List<Integer> elements = new ArrayList<>();

        System.out.println("---先序----");
        preOrder(node1, elements);
        for(Integer i : elements) {
            System.out.println(i);
        }

        System.out.println("---中序----");
        elements.clear();
        inOrder(node1, elements);
        for(Integer i : elements) {
            System.out.println(i);
        }

        System.out.println("---后序----");
        elements.clear();
        postOrder(node1, elements);
        for(Integer i : elements) {
            System.out.println(i);
        }
    }

    /**
     * 先序深度优先遍历：先根，再左，再右
     * @param node
     * @param elements
     */
    public static void preOrder(BinaryTree.Node node, List<Integer> elements) {
        if (node == null) {
            return;
        }
        elements.add(node.getElement());
        preOrder(node.getLeftChild(), elements);
        preOrder(node.getRightChild(), elements);
    }

    /**
     * 中序深度优先遍历：先左，再中，再右
     * @param node
     * @param elements
     */
    public static void inOrder(BinaryTree.Node node, List<Integer> elements) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeftChild(), elements);
        elements.add(node.getElement());
        inOrder(node.getRightChild(), elements);
    }

    /**
     * 后序深度优先遍历：先左，再右，再中
     * @param node
     * @param elements
     */
    public static void postOrder(BinaryTree.Node node, List<Integer> elements) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeftChild(), elements);
        postOrder(node.getRightChild(), elements);
        elements.add(node.getElement());
    }
}
