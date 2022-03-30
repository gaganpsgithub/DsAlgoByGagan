package com.codeTest;
import java.util.*;

public class HashMap {
	
	static void hashMapCount(String str) {
	
		java.util.HashMap<String, Integer> hashMap = new java.util.HashMap<String, Integer>();
		hashMap.put("a", 1);
		hashMap.put("a", 2);
		hashMap.put("c", 1);
		hashMap.put("d", 1);
		System.out.println(hashMap);
		for(Map.Entry<String, Integer> set :hashMap.entrySet()) {
			System.out.print(set.getKey());
			System.out.print(set.getValue());
		}
//		for(int i=0;i<hashMap.size();i++)
//		{
//			System.out.println(hashMap.);
//		}
//		for(int i=0;i<str.length();i++){
//			if(hashMap.containsKey(str.charAt(i))) {
//				System.out.println(hashMap.get(str.charAt(i)));
//			}
//			else {
//				hashMap.put(str.charAt(i), value)
//			}
//		}
	}

	public static void main(String[] args) {
		hashMapCount("eassseee");
	}

}
