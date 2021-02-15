package coleccion7;

import java.util.Arrays;

public class Ejercicio7 {
	static double[][] multiplicarMatrices (double[][] A, double [][] B){
		double[][] matrizMultiplicada = new double[A.length][B[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				
				for (int k = 0; k < A[0].length-1; k++) {
					matrizMultiplicada[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		return matrizMultiplicada;
		
	}
	
	public static void main(String[] args) {
		double[][] a1 = {{1,2,3},{4,5,6}};
		double[][] a2 = {{5, -1},{1, 0},{-2, 3}};
		double[][] aProd = multiplicarMatrices(a1, a2);
		for (int i = 0; i < aProd.length; i++) {
			System.out.println(Arrays.toString(aProd[i]));
		}
	}
}
