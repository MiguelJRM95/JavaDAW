import java.util.Scanner;
import java.util.Arrays;

public class devolverCambio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa la cantidad en euros");
		double cantidad = teclado.nextDouble();
		if(cantidad < 10)System.out.println(Arrays.toString(Utilidades.devolverCambio(cantidad)));
		teclado.close();
	}
}
