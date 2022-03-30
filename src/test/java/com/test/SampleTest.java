package com.test;

public class SampleTest {

	static String printString(String str) {
		
		String[] strArray = str.split(" ");
		String finalString="";
		
		char[] vowelArray = {'a','e','i','o','u'};
		for(int i=0;i<strArray.length;i++) {
			boolean flag=false;
			for(int j=0;j<vowelArray.length;j++) {
				if(strArray[i].charAt(0)==vowelArray[j]) {
					finalString=finalString+" "+strArray[i]+"a";
					flag=true;
					break;
				}
			}
			if(flag==false) {
				finalString=finalString+" "+strArray[i].substring(1, strArray[i].length())+strArray[i].charAt(0);
			}
			
		}
		return finalString;
		
	}
	
	public static void main(String[] args) {
		String str ="i work in lenksart";
//		String expectd ="Ia orkw ina enksartl";
		
		System.out.println(printString(str));
		
	}

}
