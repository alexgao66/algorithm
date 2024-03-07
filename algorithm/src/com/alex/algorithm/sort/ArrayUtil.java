package com.alex.algorithm.sort;

/**
 * @author: gaojun
 * @date: 2024/3/7
 **/
public class ArrayUtil {
    static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
    }
}
