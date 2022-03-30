package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramGroup {

	static List<List<String>> anagramList(List<String> stringArray) {
			
		List<List<String>> finalList = new ArrayList<List<String>>();
		for(int i=0;i<stringArray.size();i++) {
			List<String> strList = new ArrayList<String>();
			for(int j=0;j<=i;j++) {
				if(isAnagram(stringArray.get(i), stringArray.get(j)))
				{
					continue;
				}
			}
			strList.add(stringArray.get(i));
			for(int j=i+1;j<stringArray.size()-1;j++) {
				if(isAnagram(stringArray.get(i), stringArray.get(j)))
				{
					strList.add(stringArray.get(j));
				}
			}
			finalList.add(strList);
		}
		return finalList;
	}
	
	static boolean isAnagram(String str1, String str2) {
		
		if(str1.length()!=str2.length())
			return false;
		
		int[] indexArray = new int[256];
		for(int i=0;i<str1.length();i++) {
			indexArray[str1.charAt(i)]++;
			indexArray[str2.charAt(i)]--;
		}
		for(int i=0;i<256;i++) {
			if(indexArray[i]>0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("abc");
		strList.add("bcd");
		strList.add("cab");
		strList.add("cd");
		strList.add("cba");
		
		System.out.println(anagramList(strList));
//		Input: {“abc”, “bcd”, “bcd”, “bcd”, “cdb”, “cba”, “ab”}
//		Output: {{“abc”, “cab”, “cba”}, {“bcd”, “cdb”}, {“cd”}, {“ab”}}



	}

}
