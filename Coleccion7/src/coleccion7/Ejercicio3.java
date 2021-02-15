package coleccion7;

public class Ejercicio3 {
	
	static int[][] obtenerMatrizIdentidad(int dimension){
		int[][] nuevaMatriz = null;
		if(dimension > 0) {
			nuevaMatriz = new int[dimension][dimension];
			for(int i=0; i<nuevaMatriz[0].length;i++) {
				for(int j=0; j<nuevaMatriz.length;j++) {
					if(i == j) {
						nuevaMatriz[j][i] = 1;
					}else {
						nuevaMatriz[j][i] = 0;
					}
				}
			}
		}else {
			return null;
		}
		
		return nuevaMatriz;
	}
	
	public static void main(String[] args) {
		int[][] miMatriz = obtenerMatrizIdentidad(1);
		for (int[] fila : miMatriz) {
			System.out.println("\n");
			for (int numero : fila) {
				System.out.format(" %02d",numero);
			}
		}
	}
}
