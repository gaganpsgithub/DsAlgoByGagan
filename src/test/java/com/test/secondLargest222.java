package com.test;

public class secondLargest222 {

	private static secondLargest222 inst;
	
	private secondLargest222() {
		
	}
	
	static public secondLargest222 getInstance() {
		if(inst==null) {
			inst=new secondLargest222();
			System.out.println("test");
		}
		return inst;
	}
//	static int secondLargest(int[] arr) {
//		
//		int res = -1;
//		int larg = 0;
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>larg) {
//				res=larg;
//				larg=arr[i];
//			}
//			else if(arr[i]!=larg) {
//				if(res==-1 || arr[i]> res) {
//					res = arr[i];
//				}
//			}
//		}
//		return res;
//		
//	}
	
	public static void main(String[] args) {
		
		secondLargest222.getInstance();
		
//		int[] arr = {17,12,6,9,18,34,23};
//		System.out.println(secondLargest(arr));
		
		
		

	}

}
