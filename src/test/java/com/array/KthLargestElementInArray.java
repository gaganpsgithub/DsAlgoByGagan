package com.array;

public class KthLargestElementInArray {

	
	static int kthLargest(int[] arr, int k) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(i==k-1)
			{
				return arr[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,8,12,7,6,2,4};
		
		System.out.println(kthLargest(arr,4));

	}

}
