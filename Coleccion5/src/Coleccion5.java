import java.util.Scanner;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Coleccion5 {

	public static int sumaPares(int numIntro) {
		int sumaTot = 0;
		int cantReal = numIntro * 2;
		for (int i = 0; i <= cantReal; i++) {
			if (i > 0 && i % 2 == 0) {
				sumaTot = sumaTot + i;
			}
		}
		return sumaTot;
	};

	public static int imprimirFibonacci(int n) {
		int n1 = 1;
		int n2 = 1;

		if (n > 2) {
			for (int i = 0; i <= n; i++) {
				n1 += n2;
			}
		} else {
			n1 = 0;
		}
		return n1;
	}

	public static String fraseAlReves(String frase) {
		frase.toLowerCase();
		boolean esPalindromo = true;

		for (int i = 0; i < frase.length() - 1; i++) {
			if (frase.charAt(i) != frase.charAt(frase.length() - 1 - i))
				esPalindromo = false;
		}

		return (esPalindromo) ? "Es palindromo" : "No es Palindromo";
	}

	public static int contarCifras(int n) {
		if (n < 0)
			n *= -1;
		int numCifras = 0;
		String digToString = Integer.toString(n);
		numCifras = digToString.length();
		return numCifras;
	}

	public static void devolverCambio(double cantidad) {
		final int[] MONEDAREAL = { 2, 1, 50, 20, 10, 5, 2, 1 };
		final int[] MONEDASTOCENT = { 200, 100, 50, 20, 10, 5, 2, 1 };
		if (cantidad < 10) {
			double cantToCentimos = cantidad * 100;
			for (int i = 0; i < MONEDASTOCENT.length; i++) {
				if (cantToCentimos >= MONEDASTOCENT[i]) {
					int numMon = (int) Math.floor(cantToCentimos / MONEDASTOCENT[i]);
					cantToCentimos %= MONEDASTOCENT[i];
					System.out.println("Numero de monedas de " + MONEDAREAL[i] + " : " + numMon);
				}
			}
		} else {
			System.out.println("Cantidad demasiado alta");
		}
	}

	public static int cuentaPalabras(String frase) {
		int numPalabras = 0;
		String fraseToLow = frase.toLowerCase().trim();
		numPalabras = fraseToLow.split("\n|\t|\\s").length;
//		String fraseToLow = frase.toLowerCase().trim();
//		if(fraseToLow.length() > 0 &&
//				(fraseToLow.charAt(0) != '\n' && fraseToLow.charAt(0) != '\t' && fraseToLow.charAt(0) != ' ')) {
//			numPalabras += 1;
//			for(int i = 0; i<fraseToLow.length()-1; i++) {
//				if((fraseToLow.charAt(i) == '\n' || fraseToLow.charAt(i) == '\t' || fraseToLow.charAt(i) == ' ') &&
//						(fraseToLow.charAt(i+1) != '\n' || fraseToLow.charAt(i+1) != '\t' || fraseToLow.charAt(i+1) != ' ')) {
//					numPalabras++;
//				}
//			}
//		}
		return numPalabras;
	}

	public static void ordenar3Numeros(double n1, double n2, double n3) {
		double[] listaNumeros = { n1, n2, n3 };
		double swap = 0;
		for (int i = 0; i < listaNumeros.length; i++) {
			for (int j = i + 1; j < listaNumeros.length; j++) {
				if (listaNumeros[i] > listaNumeros[j]) {
					swap = listaNumeros[i];
					listaNumeros[i] = listaNumeros[j];
					listaNumeros[j] = swap;
				}
			}
		}

		System.out.println(Arrays.toString(listaNumeros));
	}

	public static void apostarQuiniela() {
		SecureRandom rand = new SecureRandom();
		final int[] POSIBILIDADES = { 0, 1, 2 };
		ArrayList<String> quiniela = new ArrayList<String>();
		for (int i = 0; i < 14; i++) {
			int azar = rand.nextInt(3);
			if (azar == POSIBILIDADES[0]) {
				quiniela.add("X");
			} else if (azar == POSIBILIDADES[1]) {
				quiniela.add("1");
			} else if (azar == POSIBILIDADES[2]) {
				quiniela.add("2");
			}
		}
		String listString = String.join(", ", quiniela);
		System.out.println(listString);
	}

	public static void lanzarMoneda(int numLanzamientos) {
		SecureRandom rand = new SecureRandom();
		double contCara = 0;
		double contCruz = 0;
		if (numLanzamientos >= 1000) {
			for (int i = 0; i < numLanzamientos; i++) {
				int caraCruz = rand.nextInt((2 - 1) + 1);
				if (caraCruz == 1) {
					contCruz++;
				} else {
					contCara++;
				}
			}
		}
		System.out.println("El numero de veces que ha salido cara es: " + new DecimalFormat("0").format(contCara) + "\n"
				+ "El numero de veces que ha salido cruz es: " + new DecimalFormat("0").format(contCruz) + "\n"
				+ "El porcentaje de probabilidad de cada uno ha sido: "
				+ new DecimalFormat("0.00").format(((contCara * 100) / (numLanzamientos))) + " - "
				+ new DecimalFormat("0.00").format(((contCruz * 100) / (numLanzamientos))));

	}

	public static int maximoComun(int m, int n) {
		int resto;
		if (m > n)
			do {
				resto = m % n;
				m = n;
				n = resto;
			} while (resto != 0);
		return m;
	}

	public static int minimoComun(int m, int n) {
		final int MCD = maximoComun(m, n);
		return ((m * n) / MCD);
	}

	public static boolean primosMutuos(int m, int n) {
		boolean primosMutuos = false;
		int swap = 0;
		if (n > m) {
			swap = m;
			m = n;
			n = swap;
		}
		if (maximoComun(m, n) == 1 && m > 0 && n > 0) {
			primosMutuos = true;
		}
		return primosMutuos;
	}

	public static boolean esPrimo(int m) {
		boolean esPrimo = true;
		int valorMax = (int) Math.sqrt(m);
		if (m > 2) {
			for (int i = 2; i <= valorMax; i++) {
				if (m % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}
		return esPrimo;
	}

}
