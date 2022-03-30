package com.sort;

public class BubbleSortInt {

	static void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,8,8,12,7,6,2,4};
		
		bubbleSort(arr);

	}

}
