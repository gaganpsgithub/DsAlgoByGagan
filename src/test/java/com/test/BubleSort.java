package com.test;

public class BubleSort {

	static void sortedArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arry = {0,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0};
		sortedArray(arry);

	}

	
	
	
}



