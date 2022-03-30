package com.hashing;

import java.util.HashMap;

public class FrequencyOfElement {

	static HashMap<Integer, Integer> frequencyOfElement(int[] arr){
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hashMap.containsKey(arr[i])) {
				int getValue = hashMap.get(arr[i]);
				getValue++;
				hashMap.put(arr[i], getValue);
			}
			else {
				hashMap.put(arr[i], 1);
			}
		}
		return hashMap;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {12,10,11,9,12,11};
		System.out.println(frequencyOfElement(arr));

	}

}
