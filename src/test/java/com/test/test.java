package com.test;

public class test {
	
	static void print(int value) {
		
		int count  = 1;
		
		for(int i=0;i<value;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<value;j++) {
				if(j==i)
					System.out.print(count);
				else if(j==value-1)
					System.out.print(count);
				else
					System.out.print("  ");
			}
			count++;
			System.out.println("\n");
		}	
		for(int i=value;i>=0;i--) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<value;j++) {
				if(j==i)
					System.out.print(count);
				else if(j==value-1)
					System.out.print(count);
				else
					System.out.print("  ");
			}
			count--;
			System.out.println("\n");
		}	
	}

	public static void main(String[] args) {
		int value = 4;
		print(value);
	}
}
//*
// *
//  *