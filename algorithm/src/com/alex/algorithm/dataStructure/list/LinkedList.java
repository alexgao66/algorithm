package com.alex.algorithm.dataStructure.list;

/**
 * 双向链表
 * @author alex
 *
 */
public class LinkedList {
	
	
	/**
	 * 链表头
	 */
	private Item header = new Item(null,null,null);
	
	private int size = 0;
	
	public LinkedList() {
		header.previous = header.next = header;
	}
	
	/**
	 * 清空链表
	 */
	public void makeEmpty() {
		Item item = header.next;
		while(item != header) {
			Item next = item.next;
			item.next = item.previous = null;
			item.element = null;
			item = next;
		}
		header.next = header.previous = null;
		size = 0;
	}
	
	/**
	 * 将字符串element插入item之前
	 * @param element 待插入的字符串
	 * @param item 在item之前插入
	 */
	public void insertBefore(String element,Item item) {
		Item current = new Item(element, item.previous, item);
		current.previous.next = current;
		current.next.previous = current;
		++size;
	}
	
	public void push(String element) {
		insertBefore(element, header);
	}
	
	/**
	 * 将字符串element插入位置index
	 * @param element
	 * @param index
	 */
	public void insertAt(String element,int index) {
		Item item = this.get(index);
		this.insertBefore(element, item);
	}
	
	/**
	 * 删除首元素
	 */
	public void removeFirst() {
		Item item = header.next;
		header.next = item.next;
		item.next.previous = header;
		item = null;
	}
	
	/**
	 * 删除最后一个元素
	 */
	public void removeLast() {
		Item item = header.previous;
		header.previous = item.previous;
		item.previous.next = header;
	}
	
	/**
	 * 删除指定字符串element
	 * @param element
	 */
	public void remove(String element) {
		Item item = find(element);
		if(item == null) {
			return;
		}
		item.previous.next = item.next;
		item.next.previous = item.previous;
		item = null;
	}
	
	/**
	 * 获取指定下标处的字符串
	 * @param index
	 */
	public Item get(int index) {
		// 超过元素数量
		if(index > size - 1 || index < 0) {
			return null;
		}
		// 在后半部分，倒着找
		if(index > (size >> 1)) {
			Item item = header.previous;
			for(int i = size - 1; i > index; --i) {
				item = item.previous;
			}
			return item;
		}else { // 在前半部分，顺着找
			Item item = header.next;
			for(int i = 0; i < index; ++i) {
				item = item.next;
			}
			return item;
		}
	}
	
	/**
	 * 
	 * 获取字符串element所在的位置
	 * @param element
	 * @return
	 */
	public int indexOf(String element) {
		Item item = header.next;
		int i = 0;
		while(!element.equals(item.element) && !item.equals(header)){
			item = item.next;
			++i;
		};
		return i;
	}
	
	/**
	 * 获取字符串对应的元素
	 * @param element
	 * @return
	 */
	public Item find(String element) {
		Item item = header.next;
		while(!element.equals(item.element) && !item.equals(header)) {
			item = item.next;
		}
		return item;
	}
	
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("[");
		Item item = header.next;
		while(item != header) {
			if(!"[".equals(str.toString())){
				str.append(",");
			}
			str.append(item.element);
			item = item.next;
		}
		return str.append("]").toString();
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.push("a");
		linkedList.push("b");
		linkedList.push("c");
		System.out.println(linkedList);
		System.out.println(linkedList.get(1));
		linkedList.insertAt("d", 2);
		System.out.println(linkedList);
		linkedList.removeFirst();
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
		linkedList.push("e");
		linkedList.push("f");
		System.out.println(linkedList);
		linkedList.remove("e");
		System.out.println(linkedList);
		System.out.println(linkedList.indexOf("b"));
	}
	
	/**
	 * 表元素
	 * @author alex
	 *
	 */
	private static class Item {
		
		/**
		 * 元素值-字符串
		 */
		String element;
		
		/**
		 * 上一个节点
		 */
		Item previous;
		
		/**
		 * 下一个节点
		 */
		Item next;

		public Item(String element, Item previous, Item next) {
			super();
			this.element = element;
			this.previous = previous;
			this.next = next;
		}
		
		public String toString() {
			return this.element;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((element == null) ? 0 : element.hashCode());
			result = prime * result + ((next == null) ? 0 : next.hashCode());
			result = prime * result
					+ ((previous == null) ? 0 : previous.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			if (element == null) {
				if (other.element != null)
					return false;
			} else if (!element.equals(other.element))
				return false;
			if (next == null) {
				if (other.next != null)
					return false;
			} else if (!next.equals(other.next))
				return false;
			if (previous == null) {
				if (other.previous != null)
					return false;
			} else if (!previous.equals(other.previous))
				return false;
			return true;
		}
		
	}
	
}
