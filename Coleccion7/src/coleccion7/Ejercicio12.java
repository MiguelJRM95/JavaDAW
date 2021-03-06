package coleccion7;


/**
 * @author Miguel Rodríguez Martinez
 *
 */
public class Ejercicio12 {
	/**
	 * @param matriz
	 * @param umbral
	 * @param porcentaje
	 * @return imagenOscura ===> Si es oscura devuelve true, si es mas clara devuelve false
	 */
	static boolean esOscura(int[][] matriz,  int umbral, double porcentaje) throws IllegalArgumentException {
		boolean imagenOscura = false;
		boolean checkPassed = false;
		//COMPROBACIONES
		while(!checkPassed) {
			boolean matrizCuadrada = false;
			boolean checkUmbral = false;
			boolean checkPorcentaje = false;
			for(int i =0; i<matriz[i].length-1; i++){
				if(matriz[i].length == matriz[i+1].length && (matriz.length*matriz[0].length) >=36) {
					matrizCuadrada = true;
				}else {
					/**
					 * @exception Si la matriz no es cuadrada o tiene menos de 36 celdad consideradas pixeles
					 */
					throw new IllegalArgumentException("No es una matriz cuadrada con suficientes pixeles");
				}
			}
			if(umbral>=0 && umbral<=255) {
				checkUmbral = true;
			}else {
				/**
				 * @exception El umbral pasado como parametro sale del rango
				 */
				throw new IllegalArgumentException("Umbral fuera de rango 0-255");
			}
			if(porcentaje>=0 && porcentaje<=100) {
				checkPorcentaje = true;
			}else {
				/**
				 * @exception El rango de porcentaje pasado como parametro sale del establecido
				 */
				throw new IllegalArgumentException("Porcentaje fuera de rango 0-100");
			}
			if(matrizCuadrada && checkUmbral && checkPorcentaje) {
				checkPassed = true;
			}else {
				/**
				 * @error Si surge cualquier error desconocido se avisa al usuario y se cierra el programa
				 */
				System.err.println("Error, el programa ha finalizado por un error desconocido");
				System.exit(0);
			}
		}
		//Si pasa sale del bucle si no, el programa se cierra
		double pixeles = matriz.length*matriz[0].length;
		double cont = 0;
		double porcentajeMatriz = 0.0;
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length;j++) {
				if(matriz[i][j]<umbral) {
					cont++;
				}
			}
		}
		porcentajeMatriz = (cont/pixeles)*100;
		if(porcentajeMatriz >= porcentaje) {
			imagenOscura = true;
		}
		return imagenOscura;
	}
}

