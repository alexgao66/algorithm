package com.alex.algorithm.leetcode;

/**
 * 按左右下标计算子数组之和
 * @author: gaojun
 * @date: 2025/9/23
 **/
public class NumArray {
    private int[] sums;
    public NumArray(int[] nums) {
        sums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) {
            sums[i+1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return sums[right+1]-sums[left];
    }
}
