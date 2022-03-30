package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementInArray1 {

	static HashMap<Integer, Integer> returnDuplicateElement(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		return hm;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {6,5,3,2,5,1,2,4};
		
		HashMap<Integer, Integer> resultHashMap = returnDuplicateElement(arr);

		for(Map.Entry<Integer, Integer> map: resultHashMap.entrySet()) {
			if(map.getValue()>1) {
				System.out.println(map.getKey());
			}
		}
	}

}
