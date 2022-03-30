package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class ArraysDemo {

//	static int checkUnique(String str) {
//		
//		
//		int length=Integer.MIN_VALUE;
//		for(int i=0;i<str.length();i++) {
//			boolean[] visitedArray = new boolean[256];
//			for(int j=i;j<str.length();j++) {
//				if(visitedArray[str.charAt(j)]==false) {
//					visitedArray[str.charAt(j)]=true;
//				}
//				else {
//					length = Math.max(length, j-i);
//					break;
//				}
//			}
//		}
//		return length;
//	}
	
	static void isStringAlpha(String str) throws IOException {
		
//		FileInputStream fis = new FileInputStream("/test/gaganTest.txt");
		
		
		String[] strArray =str.split(" ");
		
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0;i<strArray.length;i++) {
			
			hm.put(strArray[i], hm.getOrDefault(strArray[i],0)+1);
		}
		
		System.out.println(hm);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		String str = "asdasdfasd dfasdf asdfasdfsdf asdfsd asdfasdfsdf";
//		System.out.println('a'-'z');
		isStringAlpha(str);
//		System.out.println(checkUnique(str));
		
	}

}
