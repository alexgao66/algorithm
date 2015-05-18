package com.alex.algorithm.dataAlgPractise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用递归的方式include文件
 * 不能include自身
 * @author alex
 *
 */
public class IncludeFile {
	
	private static final String BASIC_PATH = "d:/temp";

	public static void main(String[] args) {
		try {
			writeIncludeFile("a.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeIncludeFile(String fileName) throws IOException{
		BufferedReader fis = new BufferedReader(new FileReader(new File(BASIC_PATH.concat("/").concat(fileName))));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(BASIC_PATH.concat("/").concat("include.txt"))));
		String line = fis.readLine();
		while(line != null){
			int includeIndex = line.indexOf("#include");
			
			if(includeIndex != -1){
				String includeFileName = line.substring(includeIndex+9,line.length()-1);
				if(includeFileName.equals(fileName)){
//					System.err.println("include不能包含自身！");
				}else {
					writeIncludeFile(includeFileName);
				}
			}else{
				System.out.println(line);
			}
			bw.write(line,0,line.length());
			bw.write("\n");
			line = fis.readLine();
		}
		bw.flush();
	}
}
