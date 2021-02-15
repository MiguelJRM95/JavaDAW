package coleccion7;

public class Ejercicio5 {
	public static double[][] sumarMatrices(double[][] primera, double[][] segunda){
		double[][] matrizSuma = null;
		if(primera.length == segunda.length && primera[0].length == segunda[0].length) {
			matrizSuma = new double[primera.length][primera[0].length];
			for(int i=0; i<matrizSuma.length;i++) {
				for(int j=0; j<matrizSuma[i].length;j++) {
					matrizSuma[i][j]=primera[i][j] + segunda[i][j];
				}
			}
		}else {
			return null;
		}
		return matrizSuma;
	}
	
	public static void main(String[] args) {
		double[][] matriz1 = {{1, 1, 1},{1, 1, 1,},{1, 1, 1}};
		double[][] matriz2 = {{1, 1, 1},{1, 1, 1,},{1, 1, 1}};
		double[][] matrizSuma = sumarMatrices(matriz1, matriz2);
		for (double[] fila : matrizSuma) {
			System.out.println("\n");
			for (double numero : fila) {
				System.out.format("%.1f\s\s",numero);
			}
		}
	}
}
