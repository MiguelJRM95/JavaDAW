import java.util.Scanner;

public class AlumnosAprobadosNumero {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		double nota;
		int numCont, totAprob;

		numCont = 0;
		totAprob = 0;
		
		
		do{
			numCont++;

			System.out.println("Introduce nota");
			nota = teclado.nextDouble();

			if (nota >= 5){

				totAprob++;
			}
			
		}while(nota>=0);
		
		teclado.close();
		System.out.println("El total de alumnos aprobados es " + totAprob);
		System.out.println("Calificaciones introducidas " + (numCont-1));
		System.out.println("Porcentaje de alumnos aprobados " + ((totAprob*100.0)/(numCont-1)));
	}
}
