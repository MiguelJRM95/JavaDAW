package coleccion7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Ejercicio12Test {

	@Test
	void testParametrosValidosYOscura() {
		int[][] matriz = {{0,0,50,50,100,100},{0,0,50,50,100,100},{0,0,50,50,100,100},{150,150,150,200,200,200},{150,150,150,200,200,200},{150,150,150,200,200,200}};
		assertTrue(Ejercicio12.esOscura(matriz, 200, 50));
	}
	
	@Test
	void testParametrosValidosYNoOscura() {
		int[][] matriz = {{0,0,50,50,100,100},{0,0,50,50,100,100},{0,0,50,50,100,100},{150,150,150,200,200,200},{150,150,150,200,200,200},{150,150,150,200,200,200}};
		assertFalse(Ejercicio12.esOscura(matriz, 200, 90));
	}
	
	@Test
	void testMatrizCheckMatrizFalse() {
		int[][] matriz = {{0,0,50,50,100,100},{0,0,50,50,100,100},{0,0,50,50,100,100},{150,150,150,200,200,200},{150,150,150,200,200,200}};
		String mensajeEsperado = "No es una matriz cuadrada con suficientes pixeles";
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			Ejercicio12.esOscura(matriz, 200, 50);
		});
		assertEquals(mensajeEsperado, exception.getMessage());
	}
	
	@Test
	void testMatrizCheckUmbralFalse() {
		int[][] matriz = {{0,0,50,50,100,100},{0,0,50,50,100,100},{0,0,50,50,100,100},{150,150,150,200,200,200},{150,150,150,200,200,200},{150,150,150,200,200,200}};
		String mensajeEsperado = "Umbral fuera de rango 0-255";
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			Ejercicio12.esOscura(matriz, 450, 50);
		});
		assertEquals(mensajeEsperado, exception.getMessage());
	}
	
	@Test
	void testMatrizCheckPorcentajeFalse() {
		int[][] matriz = {{0,0,50,50,100,100},{0,0,50,50,100,100},{0,0,50,50,100,100},{150,150,150,200,200,200},{150,150,150,200,200,200},{150,150,150,200,200,200}};
		String mensajeEsperado = "Porcentaje fuera de rango 0-100";
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			Ejercicio12.esOscura(matriz, 200, 150);
		});
		assertEquals(mensajeEsperado, exception.getMessage());
	}
	

}
