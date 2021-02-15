package coleccion7;

import static org.junit.Assert.assertArrayEquals;


import org.junit.jupiter.api.Test;

class Ejercicio3Test {

	@Test
	void test() {
		int[][] arrayCreada = Ejercicio3.obtenerMatrizIdentidad(4); 
		int[][] arrayTest = {{1, 0, 0, 0},{0, 1, 0, 0},{0, 0, 1, 0}, {0, 0, 0, 1}};
		assertArrayEquals(arrayTest, arrayCreada);
	}

}
