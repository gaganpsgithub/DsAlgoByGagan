package com.codeTest;

import java.util.Arrays;

public class Anagram1 {

	static boolean isAnagram(String str1,String str2) {
		if(str1.length()!=str2.length())
			return false;
		char[] charStr1=str1.toCharArray();
		char[] charStr2=str2.toCharArray();
		Arrays.sort(charStr1);
		Arrays.sort(charStr2);
		String newStr1 = new String(charStr1);
		System.out.println(newStr1);
		String newStr2 = new String(charStr2);
		System.out.println(newStr2);
		return (newStr1.equals(newStr2));
	}
	
	public static void main(String[] args) {
		String str1="listen";
		String str2="lsteni";
		System.out.println(isAnagram(str1,str2));
	}

}
