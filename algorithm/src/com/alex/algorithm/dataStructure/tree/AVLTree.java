package com.alex.algorithm.dataStructure.tree;

/**
 * 平衡二叉查找树
 * @author alex
 *
 */
public class AVLTree {

	public AVLTree() {
	}

	public int getHeight(AVLTreeNode node) {
		if (node == null) {
			return -1;
		}
		return node.height;
	}

	public void updateHeight(AVLTreeNode node) {
		node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
	}

	public int balanceFactor(AVLTreeNode node) {
		if (node == null) {
			return 0;
		}
		return getHeight(node.left) - getHeight(node.right);
	}

	public static class AVLTreeNode {
		private int value;
		private int height;
		private AVLTreeNode left;
		private AVLTreeNode right;

		public AVLTreeNode(int value, int height, AVLTreeNode left, AVLTreeNode right) {
			this.value = value;
			this.height = height;
			this.left = left;
			this.right = right;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public AVLTreeNode getLeft() {
			return left;
		}

		public void setLeft(AVLTreeNode left) {
			this.left = left;
		}

		public AVLTreeNode getRight() {
			return right;
		}

		public void setRight(AVLTreeNode right) {
			this.right = right;
		}
	}
	
}
