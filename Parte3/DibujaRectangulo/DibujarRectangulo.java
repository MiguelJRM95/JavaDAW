import java.util.Scanner;

public class DibujarRectangulo{

	public static void dibujaRectangulo(){

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el primer lado del rectangulo");
		int num1 = teclado.nextInt();

		System.out.println("Introduce el segundo lado del rectangulo");
		int num2 = teclado.nextInt();

		char ch = '*';
		int total = num1 * num2;

		if(num1 > num2){
			for(int i = 1; i<=total; i++){
				if(i%num1 !=0){
					System.out.print(ch);
					continue;
				}else if(i%num1 == 0){
					System.out.print(ch + "\n");
					continue;
				}
			}
		}else{
			for(int i = 1; i<=total; i++){
				if(i%num2 !=0){
					System.out.print(ch);
					continue;
				}else if(i%num2 == 0){
					System.out.print(ch + "\n");
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
			
		dibujaRectangulo();

	}

}