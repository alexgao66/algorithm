package com.alex.algorithm.leetcode;

/**
 * 使用二分查找查询需要插入的位置
 * @author: gaojun
 * @date: 2025/10/22
 **/
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0, h = nums.length - 1, index = -1;
        while (l <= h) {
            int m = l + (h-l)/2;
            if (nums[m] > target) {
                h = m - 1;
            }else if(nums[m] < target) {
                l = m + 1;
            }else {
                return m;
            }
        }
        return l;
    }
}
