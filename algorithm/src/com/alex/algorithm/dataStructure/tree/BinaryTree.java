package com.alex.algorithm.dataStructure.tree;


/**
 * 二叉树
 * @author alex
 *
 */
public class BinaryTree {
	
	/**
	 * 根节点
	 */
	private Node root;
	
	/**
	 * 清空树节点
	 */
	public void makeEmpty() {
		
	}
	
	/**
	 * 查询元素对应的节点，如果不存在，返回null
	 * @param element
	 */
	public Node find(Integer element) {
		Node node = null;
		
		return node;
	}
	
	/**
	 * 查询最小元素对应节点，默认返回null
	 * @return
	 */
	public Node findMin() {
		Node node = null;
		
		return node;
	}
	
	/**
	 * 查询最大元素对应节点，默认返回null
	 * @return
	 */
	public Node findMax() {
		Node node = null;
		
		return node;
	}
	
	/**
	 * 插入元素
	 * @return
	 */
	public void insert(Integer element) {
		
	}
	
	/**
	 * 删除元素
	 * @param element
	 */
	public void remove(Integer element) {
		
	}
	
	/**
	 * 中序遍历
	 */
	public void inorderTraversal() {
		
	}
	
	/**
	 * 先序遍历
	 */
	public void preorderTraversal() {
		
	}
	
	/**
	 * 后序遍历
	 */
	public void postorderTraversal() {
		
	}
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * 树节点
	 * @author alex
	 */
	private class Node {
		
		/**
		 * 节点值
		 */
		private Integer element;
		
		/**
		 * 左子节点
		 */
		private Node leftChild;
		
		/**
		 * 右子节点
		 */
		private Node rightChild;

		public Node(Integer element, Node leftChild, Node rightChild) {
			this.element = element;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
		}
	}
}
