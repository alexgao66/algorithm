package com.alex.algorithm.leetcode;

import java.util.*;

/**
 * @author: gaojun
 * @date: 2025/8/2
 **/
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> pairMap = new HashMap<>();
        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> pair = pairMap.getOrDefault(key, new ArrayList<>());
            pair.add(str);
            pairMap.put(key, pair);
        }
        return new ArrayList<>(pairMap.values());
    }

    public static void main(String[] args) {
        List<List<String>> result = groupAnagrams(new String[]{"ddddddddddg","dgggggggggg"});
        for (List<String> strList : result) {
            System.out.println("----");
            for (String str : strList) {
                System.out.println(str);
            }
            System.out.println("----");
        }
    }
}
