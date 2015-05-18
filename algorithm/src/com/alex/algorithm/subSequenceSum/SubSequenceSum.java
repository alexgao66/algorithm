package com.alex.algorithm.subSequenceSum;

public class SubSequenceSum {

	public static void main(String[] args) {
		int[] vals = {-10,-3,9,-8,-3,-7};
		System.out.println(maxSubSequenceSum1(vals));
	}
	
	public static int maxSubSequenceSum1(int[] vals){
		int maxVal = vals[0],curVal = 0;
		for(int i = 1; i < vals.length; ++i){
			curVal += vals[i];
			
			if(curVal > maxVal){
				maxVal = curVal;
			}
			if(curVal < 0){
				curVal = 0;
			}
		}
		return maxVal;
		
		
	}
}
