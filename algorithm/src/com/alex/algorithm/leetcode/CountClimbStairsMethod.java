package com.alex.algorithm.leetcode;

/**
 * 计算中爬楼梯的总共有多少中方法，每次只能爬1层或2层
 * 定义dp方程式：f(i) = f(i-1) + f(i-2)
 * @author: gaojun
 * @date: 2025/10/15
 **/
public class CountClimbStairsMethod {
    public int climbStairs(int n) {
        if(n == 1 || n == 2) {
            return n;
        }else {
            int c1 = 1, c2 = 2, cn = 0;
            for (int i = 3; i <= n; ++i) {
                cn = c1 + c2;
                c1 = c2;
                c2 = cn;
            }
            return cn;
        }
    }
}
