import java.util.Scanner;

public class DibujaTriangulos{

	public static void dibujaTriangulo(int n){
		
		String ch = "*";
		boolean validTriangle = true;

		if (n < 1 || n > 20){
			validTriangle = false;
			System.out.println("Base no valida, vuelva a ejercutar el programa" + "\n"
				+ "he intoduzca un valor entre 1 y 20");
		}

		if(validTriangle){
			for(int i = n; i>=1; i--){
				System.out.println(ch.repeat(i));
			}

		}
	}

	public static void dibujaTriangulo2(int n){

		String space = " ";
		String ch = "*";
		boolean validTriangle2 = true;

		if(n%2 == 0 || n>50){
			validTriangle2 = false;
			System.out.println("Base no valida, vuelva a ejercutar el programa" + "\n"
				+ "he intoduzca un valor impar y menor que 50");
		}else{
			int contador = 0;
			for(int i = n; i>=1; i= i - 2){
				contador++;
				System.out.print(space.repeat(contador));
				System.out.println(ch.repeat(i));
			}
		}
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la medida de la base de tu primer triandulo");
		int base1 = teclado.nextInt();
		dibujaTriangulo(base1);

		System.out.println("Introduce la medida de la base de tu segundo triandulo");
		int base2 = teclado.nextInt();
		dibujaTriangulo2(base2);
	}

}