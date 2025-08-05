package com.alex.algorithm.leetcode;

/**
 * @author: gaojun
 * @date: 2025/8/5
 **/
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int l=0;
        for(int r=0; r < nums.length; ++r) {
            if (nums[r] != 0) {
                if (r > l) {
                    nums[l] = nums[r];
                    nums[r] = 0;
                }
                ++l;
            }
        }
    }
}
