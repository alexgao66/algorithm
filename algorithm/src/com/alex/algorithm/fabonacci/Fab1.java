package com.alex.algorithm.fabonacci;

/**
 * 实现fabonacci数列
 * @author alex
 *
 */
public class Fab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fab1(1);
		fab1(2);
		fab1(3);
		fab1(4);
		fab1(5);
		fab1(6);
	}
	
	public static void fab1(int j) {
		int f3 = 0,f1 = 1, f2 = 1;
		for(int i = 1; i <= j; ++i) {
			if(i == 1 || i == 2) {
				f3 = 1;
			}else {
				f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
		}
		System.out.println(f3);
	}
}
