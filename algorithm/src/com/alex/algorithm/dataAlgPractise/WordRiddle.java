package com.alex.algorithm.dataAlgPractise;

import java.util.ArrayList;
import java.util.List;

/**
 * 字谜游戏——数据结构与算法分析第一章题目 1.2
 * @author alex
 *
 */
public class WordRiddle {
	
	public static final String[] WORD_TABLE= {"this","that","it"};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(String str : wordRiddle(new Character[][]{{'t','h','i','s'},{'t','h','e','t'}})){
			System.out.println(str);
		}
	}

	
	public static List<String> wordRiddle(Character[][] chars){
		List<String> existWords = new ArrayList<String>();
		StringBuffer wordStr = new StringBuffer();
		/**
		 * 横向遍历
		 */
		for(int i = 0; i < chars.length; ++i){
			wordStr.delete(0, wordStr.length());
			for(int j = 0; j < chars[i].length; ++j){
				wordStr.append(chars[i][j]);
				if(checkWord(wordStr.toString())){
					existWords.add(wordStr.toString());
				}
			}
		}
		
		/**
		 * 纵向遍历
		 */
		for(int i = 0; i < chars[0].length; ++i){
			wordStr.delete(0, wordStr.length());
			for(int j = 0; j < chars.length; ++j){
				wordStr.append(chars[j][i]);
				if(checkWord(wordStr.toString())){
					existWords.add(wordStr.toString());
				}
			}
		}
		
		/**
		 * 对线遍历
		 */
		for(int i = 0; i < chars.length; ++i) {
			for(int j = 0; j < chars[i].length; ++j){
				wordStr.delete(0, wordStr.length());
				wordStr.append(chars[i][j]);
				int k = i + 1; 
				int l = j + 1;
				while(k < chars.length && l < chars[i].length){
					wordStr.append(chars[k][l]);
					if(checkWord(wordStr.toString())){
						existWords.add(wordStr.toString());
					}
					++k;
					++l;
				}
			}
		}
		
		return existWords;
	}
	
	private static boolean checkWord(String word){
		System.out.println("----check: " + word);
		for(String w : WORD_TABLE){
			if(w.equals(word)){
				return true;
			}
		}
		return false;
	}
}
