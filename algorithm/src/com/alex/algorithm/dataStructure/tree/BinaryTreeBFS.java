package com.alex.algorithm.dataStructure.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 链表结构的二叉树的广度优先遍历
 */
public class BinaryTreeBFS {

    public static void main(String[] args) {
        BinaryTree.Node node4 = new BinaryTree.Node(4, null,null);
        BinaryTree.Node node5 = new BinaryTree.Node(5, null,null);
        BinaryTree.Node node2 = new BinaryTree.Node(2, node4,node5);

        BinaryTree.Node node6 = new BinaryTree.Node(6, null,null);
        BinaryTree.Node node7 = new BinaryTree.Node(7, null,null);
        BinaryTree.Node node3 = new BinaryTree.Node(3, node6,node7);

        BinaryTree.Node node1 = new BinaryTree.Node(1, node2,node3);

        System.out.println(node1);
        List<Integer> elements = BFS(node1);
        for(Integer i : elements) {
            System.out.println(i);
        }
    }


    public static List<Integer> BFS(BinaryTree.Node root) {
        List<Integer> result = new LinkedList<>();
        Queue<BinaryTree.Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            BinaryTree.Node node = queue.poll();
            result.add(node.getElement());
            if (node.getLeftChild()!=null) {
                queue.offer(node.getLeftChild());
            }
            if (node.getRightChild()!=null) {
                queue.offer(node.getRightChild());
            }
        }

        return result;
    }
}
