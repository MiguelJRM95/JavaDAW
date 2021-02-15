public class TablaMultiplicar {

	public static void tablaMultiplicar() {
		System.out.print("   ");
		for (int k = 1; k < 11; k++) {
			
			System.out.format("%4d", k); //Mostramos el primer factor
		}
		System.out.println();
		for (int i = 1; i < 11; i++) {
			
			int x = 0;
			x = x+i;
			
			System.out.format("%3d", x); //Mediante un nuevo contador se muestra el primer numero
			//System.out.println();
			for (int j = 1; j < 11; j++) {
				 
				System.out.format("%4d", i*j); //Recorre la tabla de multiplicar en si
				
			}
			System.out.println(); //Hace que la siguiente tabla se muestre una linea mas abajo
		}

	}
}
