package com.test;

import java.util.HashMap;
import java.util.Map;

public class SampleTest1 {

	static void unique(String name) {
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<name.length();i++) {
			hm.put(name.charAt(i),hm.getOrDefault(name.charAt(i), 0)+1);
		}
		
		for(Map.Entry<Character, Integer> map: hm.entrySet()) {
			if(map.getValue()==1)
				System.out.println(map.getKey());
				
		}
		
		char[] charArr = {'1', '0'};
		System.out.println(charArr.length);
		System.out.println(charArr[0]);
		System.out.println(Character.getNumericValue(charArr[0]));
		
//		name.toCharArray()
//		for(int i=0;i<name.length();i++) {
//			boolean flag=false;
//			for(int j=0;j<name.length();j++) {
//				if(name.charAt(i)==name.charAt(j)) {
//					flag=true;
//					break;
//				}
//			}
//			if(!flag)
//				System.out.println("Unique element"+ name.charAt(i));
//		}
		
	}
	
	public static void main(String[] args) {
		
		String name="gagan Preet";
//		{g,a,r,e,t}
		
		unique(name);
	}

}
