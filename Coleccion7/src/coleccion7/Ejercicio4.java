package coleccion7;

public class Ejercicio4 {
	static char[][] obtenerMatrizAsteriscos(int filas) {
		char[][] piramide = null;
		if (filas > 0) {
			piramide = new char[filas][filas * 2 - 1];
			for (int i = 0; i < piramide.length; i++) {
				for (int j = 0; j < piramide[i].length; j++) {
					if ((i + j) >= piramide[i].length / 2 && (j - i) <= piramide[i].length / 2) {
						piramide[i][j] = '*';
					} else {
						piramide[i][j] = ' ';
					}
				}
			}
		} else {
			return null;
		}
		return piramide;
	}

	public static void main(String[] args) {
		char[][] miMatriz = obtenerMatrizAsteriscos(5);
		for (char[] fila : miMatriz) {
			System.out.println("\n");
			for (char numero : fila) {
				System.out.format(" %s", numero);
			}
		}
	}
}
