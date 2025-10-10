package com.alex.algorithm.leetcode;

import java.util.*;

/**
 * 给出无重复元素数组的全排列
 * @author: gaojun
 * @date: 2025/10/10
 **/
public class Permute {

    public static void main(String[] args) {
        List<List<Integer>> res = permute(new int[]{1,2,3});
        for (List<Integer> l : res) {
            for (int i : l) {
                System.out.println(i);
            }
            System.out.println("----");
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null) {
            return res;
        }
        backtrace(nums, res, new ArrayList<>(), new HashMap<>());
        return res;
    }
    private static void backtrace(int[] nums, List<List<Integer>> res, List<Integer> current, Map<Integer,Boolean> selectedMap) {
        if(nums.length == current.size()) {
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i : nums) {
            if (selectedMap.getOrDefault(i, false)) {
                continue;
            }
            current.add(i);
            selectedMap.put(i, true);
            backtrace(nums, res, current, selectedMap);
            selectedMap.put(i, false);
            current.remove(current.size() - 1);
        }
    }
}
