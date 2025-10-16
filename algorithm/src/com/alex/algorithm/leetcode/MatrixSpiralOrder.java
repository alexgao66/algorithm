package com.alex.algorithm.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * 以螺旋的顺序输出矩阵中的各个元素
 * 设置上、下、左、右边界，按着边界遍历矩阵中各个元素，并将元素值赋值到结果数组中，
 * 需要注意每遍历完一个边界，需要将边界向中央缩进一步。
 * @author: gaojun
 * @date: 2025/10/15
 **/
public class MatrixSpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, right = matrix[0].length-1, top = 0, bottom = matrix.length-1, index = 0;
        Integer[] result = new Integer[(right + 1) * (bottom + 1)];
        while(true) {
            for(int i = left; i <= right; ++i) {
                result[index++] = matrix[top][i];
            }
            if(++top > bottom) break;
            for (int i = top; i <= bottom; ++i) {
                result[index++] = matrix[i][right];
            }
            if (--right < left) break;
            for (int i = right; i >= left; --i) {
                result[index++] = matrix[bottom][i];
            }
            if (top > --bottom) break;
            for (int i = bottom; i >= top; --i) {
                result[index++] = matrix[i][left];
            }
            if (right < ++left) break;
        }
        return Arrays.asList(result);
    }
}
