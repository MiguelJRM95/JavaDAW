public class AlumnosAprobados3 {
	public static void main(String[] args) {
		

		double nota = 0;
        int numCont = 0;
        int totAprob = 0;
		
		
		
        do{

			for (String elemento : args){

                numCont++;

                nota = Double.parseDouble(elemento);
    
                if (nota >= 5) {
                    totAprob++;
                }
    			//(nota >= 5)?totAprob++ :null;
            }
			
		}while(nota>=0);
		
		System.out.println("El total de alumnos aprobados es " + totAprob);
		System.out.println("Calificaciones introducidas " + (numCont-1));
		System.out.println("Porcentaje de alumnos aprobados " + ((totAprob*100)/(numCont-1)));
	}
}
