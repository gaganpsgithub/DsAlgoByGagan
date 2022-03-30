package com.array;

public class SecondLargest {

	static int SecondLargestValue(int[] arr) {
		
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				second=largest;
				largest=arr[i];
			}
			else {
				if(arr[i]>second && arr[i]!=largest)
					second=arr[i];
			}
		}
		return second;
	}
	
	public static void main(String[] args) {
	
		int[] arr = {5,8,8,12,7,6,2,4};
		
		System.out.println(SecondLargestValue(arr));
	
	}

}
