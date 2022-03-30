package com.array;

public class KthSmallestElement {

	static int kthSmallest(int[] arr, int smallest) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			if(i==smallest-1)
				return arr[i];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,8,12,7,6,2,4};
		
		System.out.println(kthSmallest(arr,2));

	}

}
