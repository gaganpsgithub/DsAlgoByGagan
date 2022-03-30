package com.hashing;

import java.util.HashMap;

public class FrequencyOfElementNaive {

	static void frequencyOfElement(int[] arr){
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag==true)
				continue;
			int freq=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					freq++;
				}
			}
			System.out.println(arr[i]+" : "+freq);
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12,10,11,9,12,11};
		frequencyOfElement(arr);

	}

}
