package com.Matrix;

public class TransposeMatrix {

	static void tranposeMatrix(int[][] matrix) {
		int[][] matrixNew = new int[matrix.length][matrix[0].length];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				matrixNew[j][i]=matrix[i][j];
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
		tranposeMatrix(matrix);

	}

}
