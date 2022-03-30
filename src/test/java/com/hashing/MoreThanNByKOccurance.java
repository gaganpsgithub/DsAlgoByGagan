package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class MoreThanNByKOccurance {

	static void occurance(int[] arr, int k) {
		
		int occCount=arr.length/k;
		
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for(int x:arr) {
			h.put(x, h.getOrDefault(x, 0)+1);
		}
		System.out.println(h);
		for(Map.Entry<Integer, Integer> map: h.entrySet() ) {
			if(map.getValue()>occCount)
				System.out.println(map.getKey());
		}
		
	}
	
	public static void main(String[] args) {

		int[] arr= {30,10,20,20,10,20,30,30};
//		int[] arr= {30,10,20,30,30,40,30,40,30};
		int k=4;
		occurance(arr,k);
		
	}

}
