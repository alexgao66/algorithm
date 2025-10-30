package com.alex.algorithm.leetcode;

import java.util.*;

/**
 * find two element's index, which the sum of the two element equal to the target.
 * @author: gaojun
 * @date: 2025/8/4
 **/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        List<List<Integer>> valueToIndexList = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            valueToIndexList.add(Arrays.asList(nums[i], i));
        }
        for (List<Integer> list: valueToIndexList) {
            int leftValue = target - list.get(0);
            for (List<Integer> list1: valueToIndexList) {
                if(list1.get(0) == leftValue && !list1.get(1).equals(list.get(1))) {
                    return new int[]{list.get(1), list1.get(1)};
                }
            }
        }
        return null;
    }

    public static int[] twoSumByHash(int[] nums, int target) {
        Map<Integer, Integer> valueToIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if(valueToIndexMap.containsKey(target-nums[i])) {
                return new int[]{i, valueToIndexMap.get(target-nums[i])};
            }
            valueToIndexMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i : twoSumByHash(new int[]{3,2,4}, 6)) {
            System.out.println(i);
        }
    }
}
