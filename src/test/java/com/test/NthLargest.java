package com.test;

public class NthLargest {

	static void nthLargestElement(int[] arr) {
		
//		int firstLargest = largetElement(arr, {Integer.MIN_VALUE});
//		int secondLargest = largetElement(arr, {firstLargest});
		
		
	}
	
	static int largetElement(int[] arr, int[] num) {
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;i<num.length;j++) {
				if(num[j]!=arr[i]) {
					largest=Math.max(largest, arr[i]);
				}
			}
		}
		return largest;
	}
	
	
	public static void main(String[] args) {
		int[] arr={12, 35, 1, 10, 34, 1};
		nthLargestElement(arr);

	}

}
