package com.alex.algorithm.leetcode;

/**
 * 将矩阵中0元素对应的行、列都设置为0
 * @author: gaojun
 * @date: 2025/10/14
 **/
public class MatrixSetZero {

    /**
     * 第一次遍历矩阵，使用两个数组分别记录在哪些列、哪些行上出现了0；
     * 第二次遍历矩阵，将矩阵中对应的行、列均设置为0.
     * 时间复杂度O(mn)，空间复杂度O(m+n)
     *
     * 一种将空间复杂度优化到常量O(1)的方法：
     * 1）使用矩阵的第一行、第一列替代原有的两个数组。
     * 2）为防止第一行、第一列的数据被覆盖，先提前使用两个变量，记录第一行、第一列是否有0存在；
     * 3）最后再根据第一行、第一列是否有0，单独处理一遍第一行、第一列的数据。
     *
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        int rowLength = matrix.length, colLength = matrix[0].length;
        boolean[] rowsWithZero = new boolean[rowLength];
        boolean[] colsWithZero = new boolean[colLength];
        for (int r = 0; r < rowLength; ++r) {
            for (int c = 0; c < colLength; ++c) {
                if (matrix[r][c] == 0) {
                    rowsWithZero[r] = colsWithZero[c] = true;
                }
            }
        }
        for (int r = 0; r < rowLength; ++r) {
            for (int c = 0; c < colLength; ++c) {
                if (rowsWithZero[r] || colsWithZero[c]) {
                    matrix[r][c] = 0;
                }
            }
        }
    }
}
