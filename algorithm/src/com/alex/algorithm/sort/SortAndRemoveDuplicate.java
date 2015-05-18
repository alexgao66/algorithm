package com.alex.algorithm.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * 倒序并除去重复信息
 * @author gaojun
 *
 */
public class SortAndRemoveDuplicate {
	public static void main(String[] args){
		String[] array = {"1001-45","1002-80","1003-75","1001-90","1003-60","1002-85"};
		Arrays.sort(array, 0, 6,new StrCmp());
		Set<String> keySet = new HashSet<String>();
		for(String str : array){
			String key = str.split("-")[0];
			if(!keySet.contains(key)){
				System.out.println(str);
				keySet.add(key);
			}
		}
	}
	
}

class StrCmp implements Comparator<String>{

	public int compare(String o1, String o2) {
		String[] firtArr = o1.split("-");
		String[] secArr = o2.split("-");
		int firt = Integer.valueOf(firtArr[1]);
		int sec = Integer.valueOf(secArr[1]);
		if(firt > sec){
			return -1;
		}else if(firt < sec){
			return 1;
		}
		return 0;
	}
	
}
