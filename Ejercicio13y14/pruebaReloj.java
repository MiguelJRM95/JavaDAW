package Ejercicio13y14;

public class pruebaReloj{

	public static void main(String[] args) {
		
		Reloj reloj1 = new Reloj();
		Reloj reloj2 = new Reloj(18, 50, 14);

		//Mostrar Hora original
		reloj1.mostarHora();
		reloj2.mostarHora();

		//Ajustando la hora
		reloj1.ajustarHora(15, 25);
		reloj2.ajustarHora(14, 45, 34);

		//Mostrar Hora ajustada
		reloj1.mostarHora();
		reloj2.mostarHora();


	}

}