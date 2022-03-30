package com.Matrix;

public class RotateBy90 {

	static void rotateBy90(int[][] matrix) {
		int[][] matrixNew = new int[matrix.length][matrix[0].length];
		
		for(int i=matrix.length-1;i>=0;i--) {
			for(int j=0;j<matrix[0].length;j++) {
				matrixNew[matrix.length-1-i][j]=matrix[j][i];
			}
		}
		
		for(int i=0;i<matrixNew.length;i++) {
			for(int j=0;j<matrixNew[0].length;j++) {
				System.out.println(matrixNew[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotateBy90(matrix);

	}

}
