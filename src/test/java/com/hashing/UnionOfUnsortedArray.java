package com.hashing;

import java.util.HashSet;

public class UnionOfUnsortedArray {

	static int UnionCount(int[] arr1, int[] arr2) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int x:arr1)
			hashSet.add(x);
		for(int y:arr2)
			hashSet.add(y);
		return(hashSet.size());
	}
	
	public static void main(String[] args) {
//		int[] arr1 = {10,20,10,30,20};
//		int[] arr2 = {20,10,10,40};
		int[] arr1 = {10,12,15};
		int[] arr2 = {18,12};
		System.out.println(UnionCount(arr1, arr2));

	}

}
