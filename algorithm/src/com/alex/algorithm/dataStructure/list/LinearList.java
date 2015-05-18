package com.alex.algorithm.dataStructure.list;

/**
 * 线性列表
 */
public class LinearList {
	
	/**
	 * 以数组存储
	 */
	private Object[] array;
	
	/**
	 * 最大容量
	 */
	private int capicity;
	
	/**
	 * 以存储元素数量
	 */
	private int size;
	
	public LinearList(){
		array = new Object[0];
	}
	
	public LinearList(int initSize){
		capicity = initSize;
		array = new Object[initSize];
	}
	
	public void empty(){
		array = new Object[0];
	}
	
	/**
	 * 获取元素的问题，如果不存在，则返回-1
	 * @param key 待查找元素
	 * @return 所在位置编号，从0开始
	 */
	public int indexOf(Object key){
		if(key == null){
			return -1;
		}
		for(int i = 0; i < array.length; ++i){
			if(key.equals(array[i])){
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 添加新元素
	 * @param item 待添加的元素
	 */
	public void add(Object item) {
		// 当到达最大值时
		if(this.size == this.capicity) {
			enlargeCap();
		}
		// 增加元素
		this.array[this.size++] = item;
	}
	
	/**
	 * 在指定位置插入对象
	 * @param item 带插入对象
	 * @param index 对象所属位置
	 */
	public void insert(Object item, int index) {
		// 如果容量不足，则扩展
		if(index > this.capicity) {
			enlargeCap(index - this.capicity);
		}
		// 如果在中间插入，则从插入位置往后移动元素
		if(this.size >= index) {
			for(int i = this.size; i >= index; --i) {
				this.array[i] = this.array[i-1];
			}
		}
		// 插入元素，增加已有元素数量
		this.array[index-1] = item;
		++this.size;
	}
	
	/**
	 * 删除元素
	 * @param item 待删除元素
	 */
	public void remove(Object item) {
		int index = indexOf(item);
		if(index != -1) {
			this.array[index] = null;
			for(int i = index; i < this.size && i < this.capicity-1; ++i) {
				this.array[i] = this.array[i+1];
			}
			--this.size;
		}
		
	}
	
	/**
	 * 打印所有已存在元素
	 */
	public void printItem() {
		for(Object obj : this.array) {
			System.out.print(obj + " ");
		}
	}
	
	/**
	 * 按指定大小扩大容量
	 * @param enlargeSize 扩大的大小
	 */
	public void enlargeCap(int enlargeSize) {
		// 扩展容量
		this.capicity += enlargeSize;
		Object[] newArray = new Object[this.capicity];
		for(int i = 0; i < this.array.length; ++i) {
			newArray[i] = this.array[i];
		}
		// 更新数组
		this.array = newArray;
	}
	
	/**
	 * 按默认值扩大容量
	 */
	public void enlargeCap() {
		this.enlargeCap(3);
	}
}
