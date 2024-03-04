package com.alex.algorithm.leetcode;

/**
 * leetCode 135题：按要求分糖（得分ratings多对应的糖也多，每个人至少分得1个糖）所需糖的最少数量
 * 解题思路：
 * 先从左至右计算一个一遍每个人分得糖的数量，计算逻辑：rating[i] > rating[i-1]，在leftCandy[i] = leftCandy[i-1] + 1;
 * 在按类似逻辑从右至左计算一次，并在计算的过程中将right的计算结果对left对比后取最大值，即该位置应该分得糖的数量。
 *
 * @author: gaojun
 * @date: 2024/3/4
 **/
public class Candy {

    public static void main(String[] args) {
        System.out.println(candyCount(new int[]{1,2,2}));
    }

    public static int candyCount(int[] ratings){
        int length  = ratings.length;
        int[] left = new int[length];
        for (int i = 0; i < length; ++i) {
            if (i > 0 && ratings[i] > ratings[i-1]) {
                left[i] = left[i - 1] + 1;
            }else {
                left[i] = 1;
            }
        }

        int totalCount = 0, right = 0;
        for (int i = length - 1; i >= 0; --i) {
            if (i < length - 1 && ratings[i] > ratings[i+1]) {
                ++right;
            }else {
                right = 1;
            }
            totalCount += Math.max(left[i], right);
        }
        return totalCount;
    }
}
