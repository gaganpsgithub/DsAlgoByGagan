package com.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctElementNaive {

	static int size(Integer arr[]) {
		HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(arr));
		return hashSet.size();
	}
	
	
	public static void main(String[] args) {
		Integer[] arr = {12,12,13,112,12};
		System.out.println(size(arr));
	}
	
}
