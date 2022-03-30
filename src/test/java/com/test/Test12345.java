package com.test;

import java.util.HashMap;

public class Test12345 {
	
	static HashMap<Integer, Integer> countOfInt(int[] arry){
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<arry.length;i++) {
			hm.put(arry[i], hm.getOrDefault(arry[i], 0)+1);
		}
		return hm;
		
	}
	
	public static void main(String args[]) {
		int[] arrayInt= {1,1,2,3,4,6,7,8};
		System.out.println(countOfInt(arrayInt));
	}

}
