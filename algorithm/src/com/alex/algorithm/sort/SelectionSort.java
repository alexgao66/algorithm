package com.alex.algorithm.sort;

/**
 * 选择排序
 *
 * @author: gaojun
 * @date: 2024/3/7
 **/
public class SelectionSort {

    public static void main(String[] args) {
        selectionSort(new int[]{4,1,3,1,5,2});
    }

    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            int minIndex = i;
            for (int j = i; j < array.length; ++j) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
            ArrayUtil.printIntArray(array);
            System.out.println();
        }
    }
}
