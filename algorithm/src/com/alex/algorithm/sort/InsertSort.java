package com.alex.algorithm.sort;

/**
 * 插入排序的顺序和倒序实现
 * 插入排序最差和平均的时间复杂度都是O(n*n)，最差空间复杂度是O(n)
 * 效率较低，当数量级小于千时，可以采用。
 * @author gaojun
 *
 */
public class InsertSort {
	
	/**
	 * 顺序排列
	 * @param array
	 * @return
	 */
	public static int[] sort(int[] array){
		for(int i = 1,length = array.length; i < length; ++i){
			int data = array[i];
			int j = i;
			while( j > 0 && array[j-1] > data){
				array[j] = array[j-1];
				--j;
				/*printArray(array);*/
			}
			array[j] = data;
			/*System.out.println(i);
			printArray(array);
			System.out.println();*/
		}
		return array;
	}
	
	/**
	 * 倒序排列
	 * @param array
	 * @return
	 */
	public static int[] descendSort(int[] array){
		for(int i = 1,length = array.length; i < length; ++i){
			int data = array[i];
			int j = i;
			while( j > 0 && array[j-1] < data){
				array[j] = array[j-1];
				--j;
			}
			array[j] = data;
		}
		return array;
	}
	
	public static void main(String[] args){
		int[] datas = {7,1,3,8,2,4,6,5};
		System.out.println("before sort:");
		printArray(datas);
		System.out.println("after sort:");
		printArray(descendSort(datas));
	}
	
	public static void printArray(int[] array){
		for(int i : array){
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
	}
}
