

public class ProbarValidarFecha{

	public static void main(String[] args) {
		
		ValidarFecha.validarFecha(1900, 20, 26);
		System.out.println("Es valida la fecha: " + ValidarFecha.validarFecha(1900, 20, 26));
		System.out.println("Es valida la fecha: " + ValidarFecha.validarFecha(2000, 02, 29));
		System.out.println("Es valida la fecha: " + ValidarFecha.validarFecha(2000, 02, 39));
		System.out.println("Es valida la fecha: " + ValidarFecha.validarFecha(2000, 15, 07));


	}



}