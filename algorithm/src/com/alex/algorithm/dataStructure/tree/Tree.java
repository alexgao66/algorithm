package com.alex.algorithm.dataStructure.tree;

/**
 * 一般树
 * @author alex
 *
 */
public class Tree {
	
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
	 *
	 */
	private static class Node {
		/**
		 * 节点值（字符串）
		 */
		Integer element;
		
		/**
		 * 第一个子节点
		 */
		Node firstChild;
		
		/**
		 * 下一个兄弟节点
		 */
		Node nextSibling;

		public Node(Integer element, Node firstChild, Node nextSibling) {
			super();
			this.element = element;
			this.firstChild = firstChild;
			this.nextSibling = nextSibling;
		}
	}
}
