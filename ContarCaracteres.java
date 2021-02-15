import java.util.Arrays;
import java.util.Scanner;

public class ContarCaracteres {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la frase a analizar");
		String frase = teclado.nextLine();
		System.out.println(Arrays.toString(Utilidades.contarCaracteres(frase)));
		teclado.close();
	}
}
