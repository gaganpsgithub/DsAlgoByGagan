package com.hashing;

import java.util.HashSet;

public class DistinctElementInWindow {

	static void distinctElementsCount(int[] arr, int k) {
//		int res = 0;
		for(int i=0;i<=arr.length-k;i++) {
			HashSet<Integer> h = new HashSet<Integer>();
			for(int j=i;j<k+i;j++) {
				h.add(arr[j]);
			}
//			res = Math.max(res, h.size());
			System.out.println(h.size());
		}
	}
	
	public static void main(String[] args) {
//		int[] arr= {10,20,20,10,30,40,10};
//		int[] arr= {10,10,10,10};
		int[] arr= {10,20,30,40 };
		int windowsSize = 3;
		distinctElementsCount(arr, windowsSize);
	}

}
