package coleccion7;

import static org.junit.Assert.assertArrayEquals;


import org.junit.jupiter.api.Test;

class Ejercicio1Test {



	@Test
	void test() {
		int[][] arrayToFill = new int[5][4]; 
		int[][] arrayTest = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
		assertArrayEquals(arrayTest, Ejercicio1.rellenarConsecutivosPorFilas(arrayToFill));
	}

}
