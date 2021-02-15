import java.util.Scanner;
import java.util.Arrays;

public class SerieFibonacci {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el numero hasta el cual llegar en la serie de Fibonacci");
		int numero = teclado.nextInt();
		if(numero > 2) System.out.println(Arrays.toString(Utilidades.serieFibonacci(numero)));
		teclado.close();
	}

	
	
}
