package com.test;

import java.util.HashSet;

public class GaganTest2 {

	static void printSubString(String str) {
		int power = (int) Math.pow(2,str.length());
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<power;i++) {
			int k=i;
			int count=0;
			String newStr = "";
			boolean _in=false;
			while(k!=0) {
				if(k%2==1)
				{
					_in=true;
					newStr=newStr+str.charAt(count);
					if(!hs.contains(newStr)) {
						hs.add(newStr);
						System.out.print(newStr);
						System.out.println("");
					}
				}
				else if(k%2==0 && _in) {
					break;
				}
				count++;
				k=k/2;
			}	
		}
	}
	
	public static void main(String[] args) {
		
		String value = "SDET";

		printSubString(value);
	}

}
