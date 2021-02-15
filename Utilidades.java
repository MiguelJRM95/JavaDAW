import java.security.SecureRandom;
import java.util.Arrays;

public class Utilidades {

	public static long[] serieFibonacci(int N) {
		long arrayFibonacci[] = new long[N];
		for (int i = 2; i < N; i++) {
			arrayFibonacci[0] = 1;
			arrayFibonacci[1] = 1;
			arrayFibonacci[i] = arrayFibonacci[i - 1] + arrayFibonacci[i - 2];
		}
		return arrayFibonacci;
	}

	public static int[] devolverCambio(double d) {
		final int[] MONEDASTOCENT = { 200, 100, 50, 20, 10, 5, 2, 1 };
		int numMonedas[] = new int[8];
		double cantToCentimos = d * 100;
		for (int i = 0; i < MONEDASTOCENT.length; i++) {
			if (cantToCentimos >= MONEDASTOCENT[i]) {
				int numMon = (int) Math.floor(cantToCentimos / MONEDASTOCENT[i]);
				numMonedas[i] = numMon;
				cantToCentimos %= MONEDASTOCENT[i];
			}
		}
		return numMonedas;
	}

	public static int[] contarCaracteres(String frase) {
		int[] cantPerCharType = new int[3];
		int characters = 0;
		int digits = 0;
		int whiteSapces = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isDigit(frase.charAt(i))) {
				digits++;
			} else if (Character.isLetter(frase.charAt(i))) {
				characters++;
			} else if (Character.isWhitespace(frase.charAt(i))) {
				whiteSapces++;
			}
		}
		cantPerCharType[0] = digits;
		cantPerCharType[1] = characters;
		cantPerCharType[2] = whiteSapces;
		return cantPerCharType;
	}

	public static double sumaArray(double[] miArray) {
		double suma = 0;
		for (int i = 0; i < miArray.length; i++) {
			suma += miArray[i];
		}
		return suma;
	}

	public static double[] arrayMultiplicado(double[] miArray, double factor) {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] *= Math.round(factor * 100d) / 100d;
		}
		return miArray;
	}

	public static double promedioArray(double[] miArray) {
		double media = 0;
		double suma = 0;
		for (int i = 0; i < miArray.length; i++) {
			suma += miArray[i];
		}
		media = Math.round((suma / miArray.length) * 100d) / 100d;

		return media;
	}

	public static String concatenarCadenas(String[] misFrases, char separador) {
		String finalString = "";
		for (int i = 0; i < misFrases.length; i++) {
			finalString += separador + misFrases[i];
		}
		return finalString;
	}

	public static int cadenaMayor(String[] misFrases) {
		String fraseLarguisima = "";
		int longFraseLarguisima = 0;
		for (int i = 0; i < misFrases.length; i++) {
			for (int j = 0; j < misFrases.length - 1; j++) {
				if (misFrases[i].length() > misFrases[j].length()) {
					fraseLarguisima = misFrases[i];
					longFraseLarguisima = fraseLarguisima.length();
				}
			}
		}
		return longFraseLarguisima;
	}

	public static int[] apuestaPrimitiva() {
		int[] primitiva = new int[7];
		SecureRandom rand = new SecureRandom();
		for (int i = 0; i < primitiva.length - 1; i++) {
			int numerito = rand.nextInt(49) + 1;
			primitiva[i] = numerito;
		}
		for (int i = 0; i < primitiva.length - 1; i++) {
			for (int j = 0; j < primitiva.length - 2; j++) {
				if (primitiva[i] == primitiva[j]) {
					primitiva[j] = rand.nextInt(49) + 1;
				}
			}

		}
		int reintegro = rand.nextInt(10);
		primitiva[6] = reintegro;
		return primitiva;
	}

	public static char[] apuestaQuiniela(int unos, int doses, int equis) {
		char[] quiniela = new char[14];
		char[] simbolos = { '1', 'X', '2' };
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		SecureRandom rand = new SecureRandom();
		if (unos >= 0 && doses >= 0 && equis >= 0 && unos + doses + equis == 14) {
			while (cont1 < unos || cont2 < equis || cont3 < doses) {
				for (int i = 0; i < quiniela.length; i++) {
					if (quiniela[i] == '\0') {
						int orquilla = rand.nextInt(3);
						if (simbolos[orquilla] == '1' && cont1 < unos) {
							quiniela[i] = simbolos[orquilla];
							cont1++;
						}
						if (simbolos[orquilla] == 'X' && cont2 < equis) {
							quiniela[i] = simbolos[orquilla];
							cont2++;
						}
						if (simbolos[orquilla] == '2' && cont3 < doses) {
							quiniela[i] = simbolos[orquilla];
							cont3++;
						}

					}
				}
			}

		} else {
			quiniela = null;
		}
		return quiniela;
	}

	public static char letraNIF(int DNI) {
		char[] letrasNIF = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		char letra = letrasNIF[DNI % 23];
		return letra;
	}

	public static char letraNIE(String nie) {
		char letra = ' ';
		switch (nie.charAt(0)) {
			case 'X': {
				nie = nie.replace('X', '0');
				break;
			}
			case 'Y': {
				nie = nie.replace('Y', '1');
				break;
			}
			case 'Z': {
				nie = nie.replace('Z', '2');
				break;
			}
			case 'A': {
				nie = nie.replace('A', '3');
				break;
			}
		}
		System.out.println(nie);

		int nieInt = Integer.parseInt(nie);

		letra = Utilidades.letraNIF(nieInt);

		return letra;
	}

	public static double[] estadisticaLista(double[] lista) {
		Arrays.sort(lista);
		double[] calculos = new double[6];
		double cantVal = lista.length;
		calculos[0] = cantVal;
		double minVal = lista[0];
		double maxVal = lista[lista.length - 1];
		double sum = 0;
		double moda = 0;
		double media = 0;
		double varianza = 0;

//		for (int i = 0; i < lista.length - 1; i++) {
//			if (lista[i] < lista[i + 1])
//				minVal = lista[i];
//		}
		calculos[1] = minVal;

//		for (int i = 0; i < lista.length - 1; i++) {
//			if (lista[i] > lista[i + 1])
//				maxVal = lista[i];
//		}
		calculos[2] = maxVal;

//		for (int i = 0; i < lista.length; i++) {
//			sum += lista[i];
//		}
		
		sum = sumaArray(lista);
		calculos[3]=sum;
		
//		media = (sum / lista.length);
		media=promedioArray(lista);
		calculos[4] = media;

		int maximoNumRepeticiones1 = 0;
		int maximoNumRepeticiones2 = 0;
		double moda1 = 0;
		double moda2 = 0;

		for (int i = 0; i < lista.length; i++) {
			int numRepeticiones1 = 0;
			for (int j = 0; j < lista.length; j++) {
				if (lista[i] == lista[j]) {
					numRepeticiones1++;
				}
				if (numRepeticiones1 > maximoNumRepeticiones1) {
					moda1 = lista[i];
					maximoNumRepeticiones1 = numRepeticiones1;
				}
			}
			int numRepeticiones2 = 0;
			for (int j = 0; j < lista.length; j++) {
				if (lista[i] == lista[j]) {
					numRepeticiones2++;
				}
				if (numRepeticiones2 > maximoNumRepeticiones2) {
					moda2 = lista[i];
					maximoNumRepeticiones2 = numRepeticiones2;
				}
			}
			if (moda1 < moda2) {
				moda = moda1;
			} else {
				moda = moda2;
			}
		}
		calculos[5] = moda;

		double sumCuad = 0;

		for (int i = 0; i < lista.length; i++) {

			sumCuad += Math.pow(lista[i], 2);
		}

		varianza = (sumCuad / lista.length);

		calculos[6] = (double) (Math.round(varianza * 100d) / 100d);

		return calculos;
	}
	
	public static int binarySearchString(String nombres[], String nombreBuscado) {
		int posicion = 0;
		int n = nombres.length;
		int centro, inf = 0, sup = n - 1;
		while (inf <= sup) {
			centro = (sup + inf) / 2;
			if (nombres[centro].trim().toLowerCase() == nombreBuscado) {
				posicion = centro;
				return posicion;
			} else if ((nombres[centro].trim().toLowerCase().compareTo(nombreBuscado)) < 0) {
				sup = centro + 1;
			} else {
				inf = centro - 1;
			}
		}
		return -1;
	}

	public static int buscarNombre(String nombres[], String nombreBuscado, boolean ordenada) {
		int posicion = 0;
		String nameSearch = nombreBuscado.toLowerCase();

		if (!ordenada) {
			Arrays.sort(nombres);
			posicion = binarySearchString(nombres, nameSearch);
		} else {
			posicion = binarySearchString(nombres, nameSearch);
		}
		return posicion;
	}

}
