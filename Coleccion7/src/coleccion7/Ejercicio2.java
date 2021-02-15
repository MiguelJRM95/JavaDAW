package coleccion7;

public class Ejercicio2 {
	static int[][] rellenarConsecutivosPorColumnas(int[][] matrizEnteros) {
		int cont = 0;
		for(int i=0; i<matrizEnteros[0].length;i++) {
			for(int j=0; j<matrizEnteros.length;j++) {
				cont++;
				matrizEnteros[j][i]=cont;
			}
		}
		return matrizEnteros;
		
	}
	
	public static void main(String[] args) {
		int[][] miMatriz = new int[5][4];
		rellenarConsecutivosPorColumnas(miMatriz);
		for (int[] fila : miMatriz) {
			System.out.println("\n");
			for (int numero : fila) {
				System.out.format(" %02d",numero);
			}
		}
	}
}
