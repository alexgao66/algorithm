package com.alex.algorithm.leetcode;

import java.util.HashMap;

/**
 * 请子数组之和为K的数组个数
 * @author: gaojun
 * @date: 2025/9/23
 **/
public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int sums[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) {
            sums[i + 1] = sums[i] + nums[i];
        }
        int count = 0;
        HashMap<Integer,Integer> sumCountMap = new HashMap<>(nums.length + 1);
        for (int subCount : sums) {
            count += sumCountMap.getOrDefault(subCount - k, 0);
            sumCountMap.merge(subCount, 1, Integer::sum);
        }
        return count;
    }
}
