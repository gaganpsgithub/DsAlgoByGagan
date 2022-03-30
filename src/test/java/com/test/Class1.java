package com.test;

public class Class1 {

	static void printName(String name, int n) {
		
		if(n==name.length()) {
			return;
		}
		System.out.println(name.charAt(n));
		n++;
		printName(name,n);
		
	}
	
	public static void main(String[] args) {
		String name = "Gagan";
		
		printName(name, 0);

	}

}
