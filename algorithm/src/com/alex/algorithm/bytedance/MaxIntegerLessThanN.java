package com.alex.algorithm.bytedance;

import java.util.Arrays;

/**
 * 小于n的最大数
 * 题目描述：给定一个数 n，如 23121;给定一组数字A 如2,4,9，求由 A 中元素组成的、小于n 的最数，如小于 23121的最大数为 22999
 * 解题思路：使用回溯算法来进行设计，具体逻辑是：
 * 初始化：定义最大值max对应变量并初始化为min value，记录输入数字input的长度len，以当前最大值cur=0和当前最大值长度curLength=0开始回溯
 * 递归逻辑：
 * 比较cur和max大小，并更新max；
 * 剪枝：max长度达到len
 * 递进：依次迭代遍历每一位数字，将其拼接到当前最大值变量的最后一位，成为新的cur
 * 剪枝：新cur不能大于input
 * 如果需要剪枝，则更新cur和curLength
 * 递归调用自身
 * 回退：通过max/10还原到拼接前，--len
 *
 * @author: gaojun
 * @date: 2023/12/25
 **/
public class MaxIntegerLessThanN {

    public static int max = Integer.MIN_VALUE;
    public static int len ;
    public static int targetNum;
    public static int [] nums;

    public static void main(String[] args) {
        int num = 23121;
        int numns [] = new int[]{4,2,9};
        System.out.println(getMax(num, numns));
    }

    public static int getMax(int target, int [] array){
        Arrays.sort(array);
        int length = (target + "").length();
        targetNum = target;
        len = length;
        nums = array;
        dfs(0,0);
        return max;
    }

    private static void dfs(int cur, int curLen) {
        max = Math.max(max,cur);
        if(curLen == len) return;
        for(int i = 0; i < nums.length;i++){
            int tem  = cur *10 + nums[i];
            if(tem >= targetNum){
                break;
            }
            cur = cur * 10 + nums[i];
            curLen+=1;
            dfs(cur,curLen);
            cur /= 10;
            curLen -= 1;

        }
    }
}
