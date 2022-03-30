package com.Matrix;

public class PrintBoundary {

	static void PrtBoundary(int[][] matrix) {
		if(matrix.length==1) {
			for(int i=0;i<matrix[0].length;i++) {
				System.out.println(matrix[0][i]);
			}
		}
		else if(matrix[0].length==1) {
			for(int i=0;i<matrix.length;i++) {
				System.out.println(matrix[i][0]);
			}
		}
		else {
			for(int i=0;i<matrix.length;i++) {
				System.out.println(matrix[0][i]);
			}
			for(int i=1;i<matrix[0].length;i++) {
				System.out.println(matrix[i][matrix[0].length-1]);
			}
			for(int i=matrix.length-2;i>=0;i--) {
				System.out.println(matrix[matrix.length-1][i]);
			}
			for(int i=matrix[0].length-2;i>=1;i--) {
				System.out.println(matrix[i][0]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		PrtBoundary(matrix);
	}
}
