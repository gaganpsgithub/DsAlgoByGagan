package com.test;

public class SecondLargest {

	static int secondLargestElement(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			largest = Math.max(largest, arr[i]);
		}
		System.out.println(largest);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest) {
				second = Math.max(second, arr[i]);
			}
		}
		System.out.println(second);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest && arr[i]!=second) {
				third = Math.max(third, arr[i]);
			}
		}
		return third;
	}
	
	public static void main(String[] args) {
		
		int[] arr={12, 35, 1, 10, 34, 1};
		System.out.println(secondLargestElement(arr));;

	}

}
