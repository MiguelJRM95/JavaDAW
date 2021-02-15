/**
 * @author MiguelRodriguez
 * @version 1.0
 */


package Ejercicio13y14;

public class Reloj{

	//Propiedades privadas
	private int horas;
	private int minutos;
	private int segundos;

	//Constructores usando sobrecarga
/**
*Contructor que no recibe parametros, establece la hora inicial en 00:00:00
*/
	public Reloj(){

		horas = 00;
		minutos = 00;
		segundos = 00;

	}

/**
*Contructor que tres parametros y usa la sobrecarga de métodos
*@see 		#Reloj()	metodo constructor sin parámetros
*@param 	horas 		hora incial del reloj
*@param 	minutos 	minutos iniciales del reloj
*@param 	segundos 	segundos iniciales del reloj
*/

	public Reloj(int horas, int minutos, int segundos){

		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}


	//Getters y setters
	public int getHoras(){

		return horas;

	}

	public int getMinutos(){

		return minutos;

	}

	public int getSegundos(){

		return segundos;

	}



	public void setHoras(int horas){

		this.horas = horas;

	}

	public void setMinutos(int minutos){

		this.minutos = minutos;

	}

	public void setSegundos(int segundos){

		this.segundos = segundos;

	}

	//Métodos 

/**
 * Método que devuelve un string con la hora segun el formato pedido en el ejercicio
 */
	public void mostarHora(){

		System.out.println(getHoras() + " horas, " + getMinutos() + " minutos, " + getSegundos() + " segundos");

	}

/**
 * Método para ajustar nuestro reloj, solo horas y minutos
 *
 * @param      horaAjustada       hora ajustada
 * @param      minutosAjustados   minutos ajustados
 */

	public void ajustarHora(int horaAjustada, int minutosAjustados){

		this.horas = horaAjustada;
		this.minutos = minutosAjustados;
		this.segundos = 00;

		//System.out.println(horaAjustada + " horas, " + minutosAjustados + " minutos, " + this.segundos + " segundos");

	}

/**
 * Método para ajustar nuestro reloj, esta vez también los segundos, usando sobrecarga
 *
 * @param      horaAjustada        hora ajustada
 * @param      minutosAjustados    minutos ajustados
 * @param      segundosAjustados   segundos ajustados
 */

	public void ajustarHora(int horaAjustada, int minutosAjustados, int segundosAjustados){

		this.horas = horaAjustada;
		this.minutos = minutosAjustados;
		this.segundos = segundosAjustados;

		//System.out.println(horaAjustada + " horas, " + minutosAjustados + " minutos, " + segundosAjustados + " segundos");

	}

}