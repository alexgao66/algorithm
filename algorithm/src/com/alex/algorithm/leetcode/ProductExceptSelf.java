package com.alex.algorithm.leetcode;

/**
 * 计算除自身外其他元素乘积对应的数组
 * @author: gaojun
 * @date: 2025/9/26
 **/
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null){
            return null;
        }
        if (nums.length == 1) {
            return nums;
        }
        int length = nums.length;
        int[] answer = new int[length];
        answer[0] = 1;
        int temp = 1;
        for (int i = 1; i <= length-1; ++i) {
            answer[i] = answer[i-1] * nums[i-1];
        }
        for (int i = length-2; i >= 0; --i) {
            temp *= nums[i+1];
            answer[i] *= temp;
        }
        return answer;
    }
}
