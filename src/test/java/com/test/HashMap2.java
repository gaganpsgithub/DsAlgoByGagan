package com.test;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	static void longestHistory(String[] user0, String[] user1) {
		
//		HashMap<String, Integer> map1= new HashMap<String, Integer>();
//		HashMap<String, Integer> map2= new HashMap<String, Integer>();
//		for(int j=0;j<user0.length;j++) {
//			map1.put(user0[j], j);
//		}
//		
//		for(int j=0;j<user1.length;j++) {
//			if(map1.containsKey(user1[j]))
//				map2.put(user1[j], j);
//		}
//		
//		System.out.println(map1);
//		System.out.println(map2);
//		
//		for(Map.Entry<String, Integer> map:map2.entrySet()) {
//			if(map.getKey())
//		}
		
		
		
		
		int length=Integer.MIN_VALUE;
		String str = "";
		int start=0;
		int end=0;
		for(int i=0;i<user0.length;i++) {
			str=str+user0[i]+"/";
		}
		System.out.println(str);
		for(int j=0;j<user1.length;j++) {
			String newStr = "";
			for(int k=j;k<user1.length;k++) {
				newStr=newStr+user1[k]+"/";
				if(str.contains(newStr) && k-j+1>length) {
					length=Math.max(length, k-j+1);
					start=j;
					end=k;
					
				}
				else if (!str.contains(newStr)){
					break;
				}
			}
		}
//		System.out.println(start);
//		System.out.println(end);
//		System.out.println(length);
		if(length>0) {
			for(int i=start;i<=end;i++){
				System.out.println(user1[i]);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		String[] user0 = {"/start", "/green", "/blue", "/pink", "/register", "/orange", "/one/two"};
		String[] user1 = {"/start", "/pink", "/register", "/orange", "/red", "a"};
//		String[] user1 = {"/a", "/one", "/two"};
//		String[] user0 = {"/pink", "/orange", "/yellow", "/plum", "/blue", "/tan", "/red", "/amber", "/HotRodPink", "/CornflowerBlue", "/LightGoldenRodYellow", "/BritishRacingGreen"};

//		String[] user1 = {"/pink", "/orange", "/amber", "/BritishRacingGreen", "/plum", "/blue", "/tan", "/red", "/lavender", "/HotRodPink", "/CornflowerBlue", "/LightGoldenRodYellow"};
		longestHistory(user0,user1);
		
	}

}
