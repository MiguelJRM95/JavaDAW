package coleccion7;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Ejercicio2Test {

	@Test
	void test() {
		int[][] arrayToFill = new int[5][4]; 
		int[][] arrayTest = {{1, 6, 11, 16},{2, 7, 12, 17},{3, 8, 13, 18}, {4, 9, 14, 19}, {5, 10, 15, 20}};
		assertArrayEquals(arrayTest, Ejercicio2.rellenarConsecutivosPorColumnas(arrayToFill));
	}

}
