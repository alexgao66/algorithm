package com.alex.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * leetCode 3题：求个最大无重复子串的长度
 * 思路：使用滑动窗口
 * 1）扩大窗口：从左至右依次遍历每个字符，并字符加入到map中（key为字符，value为出现的次数），移动窗口右指针；
 * 2）缩小窗口：通过map判断该字符在窗口中是否出现小于或等于1次，否则移动窗口左指针。
 *
 * @author: gaojun
 * @date: 2024/3/4
 **/
public class LengthOfLongestSubString {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        Map<Character, Integer> charCountMap = new HashMap<>();
        while (right < s.length()) {
            Character c1 = s.charAt(right);
            ++right;
            charCountMap.put(c1, charCountMap.getOrDefault(c1, 0) + 1);
            while (charCountMap.get(c1) > 1) {
                Character c2 = s.charAt(left);
                ++left;
                charCountMap.put(c2, charCountMap.get(c2) - 1);
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}
