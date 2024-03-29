package com.alex.algorithm.sort;

/**
 * 冒泡排序
 *
 * @author: gaojun
 * @date: 2024/3/5
 **/
public class BubbleSort {

    public static void main(String[] args) {
        bubbleSort(new int[]{4,1,3,1,5,2});
    }

    public static int[] bubbleSort(int[] array) {
        for(int i = array.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            ArrayUtil.printIntArray(array);
            System.out.println();
        }
        return array;
    }



    public static int[] bubbleSortImprove(int[] array) {
        for(int i = array.length - 1; i > 0; --i) {
            boolean swap = false;
            for (int j = 0; j < i; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
            ArrayUtil.printIntArray(array);
            System.out.println();
        }
        return array;
    }
}
