import java.util.Arrays;

public class arrayCalculos {
	public static double[] estadisticaLista(double[] lista) {
		Arrays.sort(lista);
		double[] calculos = new double[7];
		double cantVal = lista.length;
		calculos[0] = cantVal;
		double minVal = lista[0];
		double maxVal = lista[lista.length - 1];
		double sum = 0;
		double moda = 0;
		double media = 0;
		double varianza = 0;

		calculos[1] = minVal;

		calculos[2] = maxVal;

		sum = Utilidades.sumaArray(lista);
		calculos[3] = sum;

		media = Utilidades.promedioArray(lista);
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

	public static void main(String[] args) {

		double[] miLista = { 1, 3, 5, 3, 6, 2, 7, 4, 8, 23, 10, 10};

		System.out.println(Arrays.toString(estadisticaLista(miLista)));
	}
}
