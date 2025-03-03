package com.alex.algorithm.dataStructure.tree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);
        bst.insert(10);

        System.out.println(bst.find(4));

        System.out.println(bst.find(9));

        System.out.println(bst.find(3));
        bst.delete(4);
        System.out.println(bst.find(3));

        System.out.println(bst.find(3));
        bst.delete(4);
        System.out.println(bst.find(3));

        System.out.println(bst.find(7));
        bst.delete(8);
        System.out.println(bst.find(7));

        System.out.println(bst.find(5));
        bst.delete(7);
        System.out.println(bst.find(5));
    }
}
