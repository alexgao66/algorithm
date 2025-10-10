package com.alex.algorithm.leetcode;

/**
 * 求出子数组的最大和
 * @author: gaojun
 * @date: 2025/9/23
 **/
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int preVal = 0, maxVal = nums[0];
        for (int v : nums) {
            preVal = Math.max(preVal + v, v);
            maxVal = Math.max(preVal, maxVal);
        }
        return maxVal;
    }
}
