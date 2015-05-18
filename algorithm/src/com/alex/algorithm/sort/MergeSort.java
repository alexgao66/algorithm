package com.alex.algorithm.sort;

/**
 * 归并排序
 * 空间复杂度为O(n)，时间复杂度为O(nlogn)
 * @author gaojun
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] array = {5,8,4,6,9,2,1,3};
		int[] temp = new int[array.length];
		printArray(array);
		mergeSort(array,0,array.length-1,temp);
		printArray(array);
	}
	
	public static void mergeSort(int[] a, int first, int last, int temp[]){
		
		if (first < last)  
	    {  
	        int mid = (first + last) / 2;  
	        mergeSort(a, first, mid, temp);    //左边有序  
	        mergeSort(a, mid + 1, last, temp); //右边有序  
	        sort(a, first, mid, last, temp); //再将二个有序数列合并  
	    }  
	}
	
	public static void sort(int[] a, int first, int mid, int last, int temp[]){
		int i = first, j = mid + 1;  
	    int k = 0;  
	      
	    while (i <= mid && j <= last)  
	    {  
	        if (a[i] <= a[j])  
	            temp[k++] = a[i++];  
	        else  
	            temp[k++] = a[j++];  
	    }  
	      
	    while (i <= mid)  
	        temp[k++] = a[i++];  
	      
	    while (j <= last)  
	        temp[k++] = a[j++];  
	      
	    for (i = 0; i < k; i++)  
	        a[first + i] = temp[i];  
	}
	
	private static void printArray(int[] objs){
		for(int obj : objs){
			System.out.print(obj);
			System.out.print(" ");
		}
		System.out.println();
	}
}
