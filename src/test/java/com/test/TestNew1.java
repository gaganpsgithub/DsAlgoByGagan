package com.test;

public class TestNew1 {

//	 static void maxSubArray(int[] arr){
//		 	int max = Integer.MIN_VALUE;
//		 	
//		 	int start=-1;
//		 	int end = -1;
//	        for(int i=0;i<arr.length; i++){
//	        	int sum=0;
//	            for(int j=i;j<arr.length;j++){
//	            	sum=sum+arr[j];
//	            	if(sum>max) {
//	            		max = Math.max(sum, max);
//	            		start=i;
//		            	end = j;
//	            	}
//	            }
//	        }
//	        System.out.println(start);
//	        System.out.println(end);
//	        System.out.println(max);
//	        for(int i=start;i<=end; i++){
//	        	System.out.println(arr[i]);
//	        }
//	    }
	
	static void maxSubArray(int[] arr){
		
		
		int prev = 0;
		int max =0 ;
		int end = 0;
		int start = 0;
		int sum = arr[0];
		for(int i=1;i<arr.length; i++){
			prev= sum;
			sum=sum+arr[0];
			if(sum<prev) {
				continue;
			}
			start=i;
			if(sum>max) {
				max = Math.max(sum, max);
				sum=0;
				end = i;
			}
		}
		System.out.println(start);
        System.out.println(end);
        System.out.println(max);
        for(int i=start;i<=end; i++){
        	System.out.println(arr[i]);
        }
	}
	 
	public static void main(String[] args) {
		{
			
			int[] array= {-1,-2,4,-1,1,5,-2,-3,-2};
			
			maxSubArray(array);
		}
	}

}
