package com.test;

public class SecondSmallest {

	static int secondLargestElement(int[] arr) {
		int largest = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			largest = Math.min(largest, arr[i]);
		}
		System.out.println(largest);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest) {
				second = Math.min(second, arr[i]);
			}
		}
		
		System.out.println(second);
		return second;
	}
	
	public static void main(String[] args) {
		
		int[] arr={12, 35, 1, 10, 34, 1};
		System.out.println(secondLargestElement(arr));;

	}

}
