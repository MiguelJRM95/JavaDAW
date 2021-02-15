import java.util.*;

public class ArrayMultiplicado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el factor de multiplicacion");
		double factorMult = teclado.nextDouble();
		
		double[] myArr = new double[args.length];
		
		for(int i = 0; i< args.length; i++) {
			myArr[i] = Double.parseDouble(args[i]);
			
		}
		
		System.out.println(Arrays.toString(Utilidades.arrayMultiplicado(myArr, factorMult)));
		teclado.close();
	}
}
