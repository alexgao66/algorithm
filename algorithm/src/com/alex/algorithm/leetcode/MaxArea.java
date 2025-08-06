package com.alex.algorithm.leetcode;

/**
 * @author: gaojun
 * @date: 2025/8/6
 **/
public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, area = 0;
        while(left < right) {
            area = height[left] < height[right] ? Math.max(area, (right-left) * height[left++]) :
                    Math.max(area, (right-left) * height[right--]);
        }
        return area;
    }
}
