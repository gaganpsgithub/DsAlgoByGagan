package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementEfficient2 {

	static void frequencyOfElement(int[] arr){
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int x:arr) {
			hashMap.put(x, hashMap.getOrDefault(x, 0)+1);
		}
		System.out.println(hashMap);
		for(Map.Entry<Integer, Integer> map:hashMap.entrySet()){
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {12,10,11,9,12,11};
		frequencyOfElement(arr);

	}

}
