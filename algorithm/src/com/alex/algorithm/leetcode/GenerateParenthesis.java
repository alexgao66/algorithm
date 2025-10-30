package com.alex.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成n个圆括号的正常组合
 * @author: gaojun
 * @date: 2025/10/23
 **/
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int leftCount = 0, rightCount = 0;
        backtrack(new StringBuilder(), n, leftCount, rightCount, result);
        return result;
    }

    public void backtrack(StringBuilder state, int n, int leftCount, int rightCount, List<String> result) {
        if (state.length() == 2*n) {
            result.add(new String(state));
        }
        if(leftCount < n) {
            state.append("(");
            backtrack(state, n, leftCount + 1, rightCount, result);
            state.deleteCharAt(state.length() - 1);
        }
        if (rightCount < leftCount) {
            state.append(")");
            backtrack(state, n, leftCount, rightCount + 1, result);
            state.deleteCharAt(state.length() - 1);
        }
    }
}
