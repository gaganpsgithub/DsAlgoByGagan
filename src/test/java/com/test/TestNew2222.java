package com.test;

import java.util.HashMap;
import java.util.Map;

public class TestNew2222 {

	static public int CHAR =256;
	
	static void characterCount(String str) {
		
		HashMap<Character, Integer> hs= new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			
			hs.put(str.charAt(i), hs.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for(Map.Entry<Character, Integer> map: hs.entrySet()) {
			System.out.print(map.getKey());
			System.out.print(map.getValue());
			System.out.println("\n");
		}
		
	}
	
	public static void main(String[] args) {
		
		String str= "my name is gagan";
		
		characterCount(str);
		
		
		
	}

}
