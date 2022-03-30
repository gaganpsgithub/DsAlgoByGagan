package com.sort;

public class BubbleSortString {

	static void bubbleSort(String[] str) {
		
		String temp = "";
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str.length-1;j++) {
				if(str[j].compareTo(str[j+1])>0) {
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
	
	public static void main(String[] args) {
		String[] str = {"gagan", "preet", "singh", "arora"};
		
		bubbleSort(str);

	}

}
