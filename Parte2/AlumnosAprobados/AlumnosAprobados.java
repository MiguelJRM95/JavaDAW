import java.util.Scanner;

public class AlumnosAprobados{

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		double nota;
		int numCont, totAprob, totAlum;

		numCont = 0;
		totAprob = 0;
		
		System.out.println("�Cuantos alumnos hay en clase?");
		totAlum = teclado.nextInt();
		
		while(numCont < totAlum){
			numCont = numCont + 1;

			System.out.println("Introduce nota" + (numCont+1));
			nota = teclado.nextDouble();

			if (nota >= 5){

				totAprob++;
			}

		
		}
		
		teclado.close();
		System.out.println("El total de alumnos aprobados es " + totAprob);
		
	}
	
}