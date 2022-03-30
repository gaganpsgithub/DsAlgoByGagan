package com.number;

public class PalindromNUmber {

	static boolean isPalindrom(int num) {
		
		int temp = num;
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		System.out.println(num);
		System.out.println(sum);
		return (num==sum);
		
	}
	
	public static void main(String[] args) {
		int num = 454;
		System.out.println(isPalindrom(num));

	}

}
