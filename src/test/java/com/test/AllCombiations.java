package com.test;

public class AllCombiations {

	static void printAllCombincations(String str) {
		int pow = (int) Math.pow(2, str.length());
		for(int i=0;i<pow;i++) {
			int count=0; 
			int k=i;
			while(k!=0) {
				if(k%2==1) {
					System.out.print(str.charAt(count));
				}
				count++;
				k=k/2;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		String str = "ABCD";
		
		printAllCombincations(str);

	}

}
