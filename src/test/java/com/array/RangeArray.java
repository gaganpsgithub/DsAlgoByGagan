package com.array;

public class RangeArray {

	static void printRange(int[][] arr){
		
		int[] arrArray = new int[1000];
		for(int i=0;i<arr.length;i++) {
			arrArray[arr[i][0]]++;
		}
		for(int i=0;i<arr.length;i++) {
			arrArray[arr[i][1]+1]--;
		}
		for(int i=1;i<1000;i++) {
			arrArray[i]=arrArray[i]+arrArray[i-1];
		}
		int start = -1;
		int end = -1;
		for(int i=0;i<15;i++) {
			
			if(arrArray[i]!=0) {
				if(start==-1)
					start=i;
			}
			else if(arrArray[i]==0 && start!=-1) {
				end =i-1;
				System.out.println("{"+start+","+end+"}");
				start = -1;
				end = -1;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] arr= {{1,2},{2,3},{3,6},{9,10}};
		printRange(arr);
	}

}
