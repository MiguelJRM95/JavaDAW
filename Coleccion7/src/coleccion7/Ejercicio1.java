package coleccion7;


public class Ejercicio1 {
	
	static int[][] rellenarConsecutivosPorFilas(int[][] matrizEnteros) {
		int cont = 0;
		for(int i=0; i<matrizEnteros.length;i++) {
			for(int j=0; j<matrizEnteros[i].length;j++) {
				cont++;
				matrizEnteros[i][j]=cont;
			}
		}
		return matrizEnteros;
		
	}
	
	public static void main(String[] args) {
		int[][] miMatriz = new int[5][4];
		rellenarConsecutivosPorFilas(miMatriz);
		for (int[] fila : miMatriz) {
			System.out.println("\n");
			for (int numero : fila) {
				System.out.format(" %02d",numero);
			}
		}
	}
	
}
