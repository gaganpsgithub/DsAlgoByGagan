package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays {

	static int intersection(int[] arr1, int[] arr2) {
		int count=0;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i=0;i<arr1.length;i++) {
			hashMap.put(arr1[i], hashMap.getOrDefault(arr1[i], 0)+1);
		}
		for(int j=0;j<arr2.length;j++) {
			hashMap.put(arr2[j], hashMap.getOrDefault(arr2[j], 0)+1);
		}
		for(Map.Entry<Integer, Integer> m: hashMap.entrySet()) {
			if(m.getValue()>1)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,10,10};
		int[] arr2 = {20,10,10};
		System.out.println(intersection(arr1, arr2));
	}

}
