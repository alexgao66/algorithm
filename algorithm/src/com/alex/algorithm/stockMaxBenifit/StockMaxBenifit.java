package com.alex.algorithm.stockMaxBenifit;

public class StockMaxBenifit {
	public static void main(String[] args) {
		int[] vals = {3,5,6,8,
						4,6,2,4,
							5,6,7,9};
		stockMaxBenifit(vals);
	}
	
	public static void stockMaxBenifit(int[] vals){
		int bugIndex = -1, sellIndex = -1,maxDistance = -1; 
		for(int i = 0,length = vals.length; i < length; ++i){
			for(int j = i + 1; j < length; ++j){
				int distance = vals[j] - vals[i];
				if(distance > maxDistance){
					maxDistance = distance;
					bugIndex = i + 1;
					sellIndex = j + 1;
				}
			}
		}
		System.out.println("buy in:" + bugIndex + ",sell in:" + sellIndex + ".Max benifit is :" + maxDistance);
	}
}
