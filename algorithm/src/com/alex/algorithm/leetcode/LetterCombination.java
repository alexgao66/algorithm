package com.alex.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 按手机键盘中数字与字母的对应关系，输入数字字符串，输出所有数字对应的字母组合
 * @author: gaojun
 * @date: 2025/9/3
 **/
public class LetterCombination {
    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }

        Map<Character,String> numToCharMap = new HashMap<>();
        numToCharMap.put('2', "abc");
        numToCharMap.put('3', "def");
        numToCharMap.put('4', "ghi");
        numToCharMap.put('5', "jkl");
        numToCharMap.put('6', "mno");
        numToCharMap.put('7', "pqrs");
        numToCharMap.put('8', "tuv");
        numToCharMap.put('9', "wxyz");
        backtrack(numToCharMap, digits, 0, new StringBuilder(), combinations);

        return combinations;
    }

    private static void backtrack(Map<Character,String> numToCharMap, String digits, int index, StringBuilder combination, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
            return;
        }
        Character num = digits.charAt(index);
        String chars = numToCharMap.get(num);
        int length = chars.length();
        for (int i = 0; i < length; ++i) {
            char c = chars.charAt(i);
            combination.append(c);
            backtrack(numToCharMap, digits, index+1, combination, combinations);
            combination.deleteCharAt(combination.length()-1);
        }
    }

    public static void main(String[] args) {
        for (String str: letterCombinations("2")) {
            System.out.println(str);
        }
    }
}
