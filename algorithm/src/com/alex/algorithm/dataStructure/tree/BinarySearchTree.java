package com.alex.algorithm.dataStructure.tree;

/**
 * 二叉查找树
 * @author alex
 *
 */
public class BinarySearchTree<T> {
	
	private Node<T> root;
	
	public BinarySearchTree(Node<T> root) {
		this.root = root;
	}
	
	public void makeEmpty() {
		
	}
	
	public int find(T val) {
		
		return -1;
	}
	
	public T findMax() {
		return null;
	}
	
	public T findMin() {
		return null;
	}
	
	public void insert(T val) {
		
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
		
	}
}
