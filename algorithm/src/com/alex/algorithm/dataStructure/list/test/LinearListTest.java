package com.alex.algorithm.dataStructure.list.test;

import com.alex.algorithm.dataStructure.list.LinearList;

public class LinearListTest {

	public static void main(String[] args) {
		testRemove();
	}
	
	private static void testRemove(){
		LinearList llA = new LinearList(3);
		llA.add(1);
		llA.add(2);
		llA.add(3);
		llA.printItem();
		System.out.println();
		llA.remove(3);
		llA.printItem();
	}
	
	private static void testInsert() {
		LinearList llA = new LinearList(3);
		llA.add(1);
		llA.add(2);
		llA.add(3);
		llA.add(4);
		llA.insert(5, 3);
		llA.printItem();
		System.out.println();
		llA.insert(10, 10);
		llA.printItem();
	}
	
	private static void testAdd() {
		LinearList llA = new LinearList(3);
		llA.add(1);
		llA.add(2);
		llA.add(3);
		llA.add(4);
		llA.add(5);
		llA.add(6);
		llA.add(7);
		llA.printItem();
	}
	
	private static void testIndexOf() {
		LinearList llA = new LinearList(3);
		llA.add(1);
		llA.add(2);
		llA.add(3);
		llA.add(4);
		
		System.out.println(llA.indexOf(3));
		System.out.println(llA.indexOf(5));
	}
}
