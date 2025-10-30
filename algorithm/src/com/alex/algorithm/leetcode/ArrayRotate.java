package com.alex.algorithm.leetcode;

/**
 * rotate the array to right by k steps
 * @author: gaojun
 * @date: 2025/9/25
 **/
public class ArrayRotate {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] newArray = new int[length];
        for (int i = 0; i < length; ++i) {
            newArray[(i+k)/length] = nums[i];
        }
        System.arraycopy(newArray, 0, nums, 0, length);
    }
}
