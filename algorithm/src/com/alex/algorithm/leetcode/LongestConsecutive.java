package com.alex.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: gaojun
 * @date: 2025/8/5
 **/
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> elementSet = new HashSet<>();
        for (int i : nums) {
            elementSet.add(i);
        }
        int longestVal = 0;
        for (int e : elementSet) {
            if (!elementSet.contains(e-1)) {
                int start = e;
                int length = 1;
                while (elementSet.contains(start+1)) {
                    ++start;
                    ++length;
                }
                longestVal = Math.max(longestVal, length);
            }
        }
        return longestVal;
    }
}
