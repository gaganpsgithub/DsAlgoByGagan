package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class IndexOfUniqueCharatcers {

	static  HashMap<Character, Integer> uniqueCharIndex(String str) {
		char[] charArray = str.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<charArray.length;i++) {
			if(hm.containsKey(charArray[i])) {
				hm.put(charArray[i], -1);
			}
			else {
				hm.put(charArray[i], i);
			}
		}
		return hm;
	}
	
	public static void main(String[] args) {
		String str = "Gagan";
		
		HashMap<Character, Integer> finalHM = uniqueCharIndex(str);
		System.out.println(finalHM.size());
		for(Map.Entry<Character, Integer> map: finalHM.entrySet()) {
			if(map.getValue()>0) {
				System.out.println(map.getKey());
				System.out.println(map.getValue());
			}
		}
	}

}
