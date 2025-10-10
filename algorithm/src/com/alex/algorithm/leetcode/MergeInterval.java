package com.alex.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 合并数字对应的间隔
 * intervals = [[1,3],[2,6],[8,10],[15,18]] -> [[1,6],[8,10],[15,18]]
 * @author: gaojun
 * @date: 2025/9/23
 **/
public class MergeInterval {
    public int[][] merge(int[][] intervals) {
        // 防御性判断
        if (intervals == null) {
            return new int[0][2];
        }
        // 排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        // 合并
        List<int[]> mergedIntervals = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; ++i) {
            int left = intervals[i][0], right = intervals[i][1];
            if (mergedIntervals.isEmpty() || mergedIntervals.get(mergedIntervals.size() - 1)[1] < left) {
                mergedIntervals.add(new int[]{left, right});
            }else {
                mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(mergedIntervals.get(mergedIntervals.size() - 1)[1], right);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
