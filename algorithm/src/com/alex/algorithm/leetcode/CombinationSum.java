package com.alex.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: gaojun
 * @date: 2025/10/23
 **/
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtack(new ArrayList<Integer>(), 0, target, candidates, result);
        return result;
    }

    public void backtack(List<Integer> state, int start, int target, int[] candidates, List<List<Integer>> result) {
        if (0 == target) {
            result.add(new ArrayList<>(state));
            return;
        }
        for (int i = start; i < candidates.length; ++i) {
            if (target - candidates[i] < 0) {
                break;
            }
            state.add(candidates[i]);
            backtack(state, i, target - candidates[i], candidates, result);
            state.remove(state.size() - 1);
        }
    }
}
