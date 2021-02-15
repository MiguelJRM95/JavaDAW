//import java.util.Scanner;


public class sumaArray {
	public static void main(String[] args) {
		
		double[] myArr = new double[args.length];
		for(int i = 0; i< args.length; i++) {
			myArr[i] = Double.parseDouble(args[i]);
			
		}
		
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Cuántos numeros quieres ingresar");
//		int longitudArray = teclado.nextInt();
//		double[] miArray = new double[longitudArray];
//		for(int i = 0; i < longitudArray; i++) {
//			System.out.println("Ingrese el digito numero " + (i+1));
//			miArray[i] = teclado.nextDouble();
//		}
//		teclado.close();
		System.out.println(Utilidades.sumaArray(myArr));
	}
}
