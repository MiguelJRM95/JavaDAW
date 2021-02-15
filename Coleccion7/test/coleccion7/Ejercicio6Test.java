package coleccion7;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Ejercicio6Test {

	@Test
	void test() {
		double[][] matrizPrueba= {{1,4,7},{2,5,8},{3,6,9}};
		double[][] matrizTransponer = {{1,2,3},{4,5,6},{7,8,9}};
		assertArrayEquals(matrizPrueba, Ejercicio6.trasponerMatriz(matrizTransponer));
	}

}
