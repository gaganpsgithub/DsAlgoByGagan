package com.test;

import java.util.HashMap;
import java.util.Map;

public class Test123444 {

	public static void main(String[] args) {

//		Write a program to swap the value of 2 variables a and b without using the 3rd variable, for e.g. a =20, b=70
		String str = "my name is gagan preet";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0)+1);
			
		}
		
		System.out.println(hm);
		
//		for(Map.Entry<Character, Integer> map:hm.entrySet()) {
//			System.out.print(map.getKey());
//			System.out.print(map.getValue());
//		}
//		static private int CHAR = 256;
//		
////		int[]  countArray = new int[CHAR];
//		for(int i=0;i<str.length();i++) {
//			countArray[str.charAt(i)]++;
//		}
//		
//		for(int i=0;i<CHAR;i++) {
//			if(countArray[i]>0) {
//				System.out.println(str.charAt(i));
//			}
//			
//			countArray[str.charAt(i)]++;
//		}
		
		
		
		
		

	}

}
