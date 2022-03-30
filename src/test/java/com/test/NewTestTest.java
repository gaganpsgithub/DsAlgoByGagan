package com.test;

public class NewTestTest {

	static void closedSum(int[] arr, int sum) {
//		int preSum =0;
		int diff = 0;
		int min=0;
		int value1=0;
		int value2=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int preSum =0;
				preSum = arr[i]+arr[j];
				diff=sum-preSum;
				if(diff>0) {
					min=Math.min(min, diff);
//					System.out.println(min);
					value1=arr[i];
					value2=arr[j];
				}
//				else
//				{
//					min=Math.max(min, diff);
//					System.out.println(min);
//					value1=arr[i];
//					value2=arr[j];
//				}
				
			}
		}
		System.out.println("Values "+value1+" "+ value2);
		
	}	
	
	public static void main(String[] args) {
		
//		You are given a sorted array  and a number X .
//		Find a pair from the array whose sum is closest to that of X.
//
//		Example :-  
//		Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
//		Output:  22 and 30
		
		int arr[] = {10, 22, 28, 29, 30, 40};
		int x = 54;
		
		closedSum(arr, x);
	}

}
