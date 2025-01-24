package com.alex.algorithm.dataStructure.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 数组结构的二叉树
 */
public class BinaryTreeByArray {
    private List<Integer> nodes;

    public BinaryTreeByArray(List<Integer> nodes) {
        this.nodes = nodes;
    }

    public Integer getLeft(Integer v) {
        if (v == null || nodes == null || nodes.isEmpty()) {
            return null;
        }
        int index = nodes.indexOf(v);
        if (index == -1) {
            return null;
        }
        int leftIndex = 2 * index + 1;
        if (leftIndex <0 || leftIndex >= nodes.size()) {
            return null;
        }
        return nodes.get(leftIndex);
    }

    public Integer getRight(Integer v) {
        if (v == null || nodes == null || nodes.isEmpty()) {
            return null;
        }
        int index = nodes.indexOf(v);
        if (index ==  -1) {
            return null;
        }
        int rightIndex = 2 * index + 2;
        if (rightIndex < 0 || rightIndex >= nodes.size()) {
            return null;
        }
        return nodes.get(rightIndex);
    }

    public List<Integer> bfs() {
        if(nodes == null || nodes.isEmpty()) {
            return Collections.emptyList();
        }
        return nodes;
    }

    public void preDFS(Integer node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node);
        preDFS(getLeft(node), result);
        preDFS(getRight(node), result);
    }

    public void inDFS(Integer node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inDFS(getLeft(node), result);
        result.add(node);
        inDFS(getRight(node), result);
    }

    public void postDFS(Integer node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postDFS(getLeft(node),result);
        postDFS(getRight(node),result);
        result.add(node);
    }

    public static void main(String[] args) {
        Integer[] tree = { 1, 2, 3, 4, null, 6, 7, 8, 9, null, null, 12, null, null, 15 };
        BinaryTreeByArray binaryTreeByArray = new BinaryTreeByArray(Arrays.asList(tree));
        System.out.println("-------------levelOrder-------------------");
        for (Integer node : binaryTreeByArray.bfs()) {
            System.out.println(node);
        }
        System.out.println("-------------preOrder-------------------");
        List<Integer> orderResult = new ArrayList<>();
        binaryTreeByArray.preDFS(1, orderResult);
        for (Integer node : orderResult) {
            System.out.println(node);
        }

        System.out.println("-------------inOrder-------------------");
        orderResult.clear();
        binaryTreeByArray.inDFS(1, orderResult);
        for (Integer node : orderResult) {
            System.out.println(node);
        }

        System.out.println("-------------postOrder-------------------");
        orderResult.clear();
        binaryTreeByArray.postDFS(1, orderResult);
        for (Integer node : orderResult) {
            System.out.println(node);
        }
    }
}
