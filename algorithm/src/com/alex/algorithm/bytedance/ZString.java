package com.alex.algorithm.bytedance;

/**
 * @author: gaojun
 * @date: 2024/1/22
 **/
public class ZString {
    public static String convert(String s, int numRows) {
        int step = 2*numRows-2;
        int interval = 0;
        StringBuilder result = new StringBuilder();
        int idx = 0;
        for(int i = 0; i < numRows; ++i) {
            idx = i;
            interval = 2 * i;
            while(idx < s.length()) {
                result.append(s.charAt(idx));
                interval = step - interval;
                if(i == 0 || i == numRows - 1) {
                    idx += step;
                }else {
                    idx += interval;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
