package com.hashing;

import java.util.HashSet;

public class DistinctElement {

	static int size(int[] arr) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			hashSet.add(arr[i]);
		}
		return hashSet.size();
	}
	
	
	public static void main(String[] args) {
		int[] arr = {12,12,12,12};
		System.out.println(size(arr));
	}
	
}
