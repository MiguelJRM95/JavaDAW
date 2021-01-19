//import java.util.Scanner;
public class PruebasEjercicios {

	public static void main(String[] args) {
		
		System.out.println("La suma de los N primeros números pares es " + Coleccion5.sumaPares(23));
		System.out.println("La serie de Fibonacci de los n primeros numeros es " + Coleccion5.imprimirFibonacci(6));
		System.out.println(Coleccion5.fraseAlReves("ala"));
		System.out.println("El número de dígitos que tiene la cifra es " + Coleccion5.contarCifras(55555));
		System.out.println("El número de dígitos que tiene la cifra es " + Coleccion5.contarCifras(55555));
		Coleccion5.devolverCambio(5.10);
		System.out.println(Coleccion5.cuentaPalabras(" Hola como estas"));
		Coleccion5.ordenar3Numeros(7.78 ,2.5, 0);
		Coleccion5.apostarQuiniela();
		Coleccion5.lanzarMoneda(1001);
		
		String primosMutuos;
		primosMutuos = Coleccion5.primosMutuos(5, 7)? "Son primos Mutuos": "No son primos mutuos";
		System.out.println(primosMutuos);
		
		String esPrimo;
		esPrimo = (Coleccion5.esPrimo(11))? "Es primo": "No es primo";
		System.out.println(esPrimo);
		
		System.out.println("El el mcd de los dos numeros es " + Coleccion5.maximoComun(72, 16));
		System.out.println("El el mcm de los dos numeros es " + Coleccion5.minimoComun(72, 16));
	}
	
	
}
