package com.hashing;

import java.util.HashSet;

public class DuplicateElementInArray {

	static int firstDuplicateIndex(int[] arr) {
		
		int temp=-1;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=arr.length-1;i>=0;i--) {
			if(hs.contains(arr[i])) {
				temp = i;
			}
			else {
				hs.add(arr[i]);
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {6,51,3,2,5,1,2,4};
		
		System.out.println(firstDuplicateIndex(arr));
	}

}
