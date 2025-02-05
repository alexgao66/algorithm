package com.alex.algorithm.dataStructure.tree;

/**
 * 二叉查找树
 * @author alex
 *
 */
public class BinarySearchTree<T extends Number> {
	
	private Node<T> root;
	
	public BinarySearchTree() {
	}
	
	public void makeEmpty() {
		
	}
	
	public Node<T> find(T val) {
		if (root == null || val == null) {
			return null;
		}
		Node<T> cur = root;
		while (cur!= null) {
			if (cur.val.intValue() == val.intValue()) {
                return cur;
            }
            if (cur.val.intValue() > val.intValue()) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
		}
		return null;
	}
	
	public T findMax() {
		return null;
	}
	
	public T findMin() {
		return null;
	}
	
	public void insert(T val) {
		if (root == null) {
			root = new Node<>(val, null, null);
			return;
		}
		Node<T> cur = root,pre = null;
		while (cur!= null) {
			if (cur.val.intValue() == val.intValue()) {
				return;
			}
			pre = cur;
			if (cur.val.intValue() > val.intValue()) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
		}
		Node<T> newNode = new Node<>(val, null, null);
		if (val.intValue() < pre.val.intValue()) {
			pre.left = newNode;
		} else {
			pre.right = newNode;
		}
	} 
	
	public void delete(T val) {
		
	}
	
	public T retrieve(int pos) {
		return null;
	}
	
	public class Node<T> {
		
		private T val;
		
		private Node<T> left;
		
		private Node<T> right;

		public Node(T val, Node<T> left, Node<T> right) {
			super();
			this.val = val;
			this.left = left;
			this.right = right;
		}

		@Override
		public String toString() {
			return "Node{" +
					"val=" + val +
					", left=" + left +
					", right=" + right +
					'}';
		}
	}
}
