package com.test;

import java.util.HashMap;
import java.util.Map;

public class Sample {

	static void printNthduplicate(char[] chrArray, int nth) {
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int count =0;
		for(int i=0;i<chrArray.length;i++) {
			if(hm.containsKey(chrArray[i])) {
				if(hm.get(chrArray[i])==0) {
					count++;
					if(count==nth)
					{
						System.out.println(chrArray[i]);
						break;
					}
					hm.put(chrArray[i], count);
				}
			}
			else
			{
				hm.put(chrArray[i], 0);
			}
		}
//		System.out.println(hm);
//		for(Map.Entry<Character, Integer>  map:hm.entrySet()) {
//			if(map.getValue()==nth) {
//				System.out.println(map.getKey());
//			}
//		}
	}
	
	public static void main(String[] args) {
		
		String str = "awqeseesawpprtyp";
		int nth = 2;
		printNthduplicate(str.toCharArray(), nth);

	}

}
