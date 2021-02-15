package coleccion7;

public class Ejercicio6 {
	public static double[][] trasponerMatriz (double[][] matrizOriginal){
		boolean matrizCuadrada = false;
		double[][] matrizTranspuesta = null;
		for(int i =0; i<matrizOriginal[i].length-1; i++){
			if(matrizOriginal[i].length == matrizOriginal[i+1].length) {
				matrizCuadrada = true;
			}
		}
		
		if(matrizCuadrada) {
			matrizTranspuesta = new double[matrizOriginal[0].length][matrizOriginal.length];
			for(int i = 0; i<matrizTranspuesta.length; i++ ) {
				for(int j = 0; j<matrizTranspuesta[i].length; j++) {
					matrizTranspuesta[i][j] = matrizOriginal[j][i];
				}
			}
		}
		
		return matrizTranspuesta;
	}
	
}
