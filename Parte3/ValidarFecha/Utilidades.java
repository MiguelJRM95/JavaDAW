/**
 * Utilidades para los ejercicios de la Colección 4.
 * Clase compuesta de funciones - métodos estáticos- que se invocarán desde otras clases
 * @author zeus
 *
 */
//package coleccion4_toJava.Parte1;
import java.util.Scanner;


public class Utilidades {
	
	/**
	 * Función que determina si un número entero es par o impar
	 * Corresponde a solución del ejercicio 6 de la colección 3
	 * @param numero valor entero
	 * @return cadena que indica si es par o impar
	 */
	public static String dimeParidad ( int numero  ) {
		
		String resultado;
		
		if (numero % 2 == 0) {
			resultado = "Es PAR ";
		} else {
			resultado = "Es IMPAR ";
		}
		return resultado;		
		
	}
	
	//corresponde a ejercicio2 de la colección 3
	public static double celsiusAFaretheim (double tempCelsius ) {
		
		double tempFarenheit;
		
		tempFarenheit = 32 + 9 * (tempCelsius / 5);
		
		return tempFarenheit;
	}
	
	//corresponde a ejercicio 5 de la colección 3
	public static double calcularPrecioRebajado (double precioInicial, double porcRebaja ) {
		
		double precioRebajado;
		
		precioRebajado = precioInicial * (1 - porcRebaja/100);
		
		return precioRebajado;
	}
	
	//corresponde a ejercicio 7 de la colección 3
	public static String saludarSegunHora (int hora) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Como te llamas?");
		String nombre = teclado.nextLine();
		teclado.close();
		String saludo;
		
		if (hora > 6 & hora < 12) {
			saludo = "Buenos dias, ";
		}
		else if(hora >= 12 & hora < 20) {
			saludo = "Buenas tardes, ";
		}else{
			saludo = "Buenas noches, ";
		}	
		
		return saludo + nombre;
		
	}
	
	//corresponde a ejercicio 9 de la colección 3
	public static double conversorTemperaturas (double temperatura, char escala ) {
		
		double tempFinal = 0;
		
		if (escala == 'C') {
			tempFinal = 32 + 9 * (temperatura / 5);
		}
		else if(escala == 'F') {
			tempFinal = (temperatura - 32) * 5 / 9;
		}
		
		return tempFinal;
	}
	
	//corresponde a ejercicio 10 de la colección 3
		public static double calcularSalarioBonificado(double salarioInicial ) {
			
			double salarioFinal = 0;
			
			if (salarioInicial>1000 & salarioInicial<=1800) {
				salarioFinal = (salarioInicial + (salarioInicial * 0.15));
			}
			else if(salarioInicial>1800) {
				salarioFinal = ((salarioInicial + (salarioInicial * 0.1)));
			}else {
				salarioFinal = ((salarioInicial + (salarioInicial * 0.2)));
			}
			
			return salarioFinal;
	}
		
		//corresponde a ejercicio 11 de la colección 3
		public static double conversorTemperaturas2 (double temperatura, char escala ) {
			
			double tempFinal = 0;
			
			if (escala == 'C') {
				tempFinal = 32 + 9 * (temperatura / 5);
			}
			else if(escala == 'F') {
				tempFinal = (temperatura - 32) * 5 / 9;
			}
			
			return tempFinal;
		}
		
		public static boolean validarEscalaTemperatura (char escala) {
			
			boolean comprobarEscala = false;
			if(escala == 'C' || escala == 'F') {comprobarEscala = true;}
			
			return comprobarEscala;
		}
		
		//corresponde a ejercicio 12 de la colección 3
		public static String devolverImporteLiteral (int importeBillete) {
			
			String billete = "";
			
			switch (importeBillete) {
			case 5:
				billete = "tu billete es de cinco euros";
				break;
			case 10:
				billete = "tu billete es de diez euros";
				break;
			case 20:
				billete = "tu billete es de veinte euros";
				break;
			case 50:
				billete = "tu billete es de cincuenta euros";
				break;
			case 100:
				billete = "tu billete es de cien euros";
				break;
			case 500:
				billete = "tu billete es de quinientos euros";
				break;
			default:
				System.out.println("No existe billete por este importe");
				break;
			}
			
			return billete;
		}
		
		//corresponde a ejercicio 13 de la colección 3
		public static double devolverMayor (double num1, double num2, double num3 ) {
			double numMayor;
			
			if(num1>num2 & num1>num3) {
				numMayor = num1;
			}
			else if(num2>num1 & num2>num3) {
				numMayor = num2;
			}else {
				numMayor = num3;
			}
			
			return numMayor;
		}
		
		//corresponde a ejercicio 19 de la colección 3
		public static int contarVocales(String frase) {
			
			int vocales = 0;
			
			for (int i =0; i<frase.length(); i++) {
				
				switch (Character.toUpperCase(frase.charAt(i))) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					vocales++;
					break;
				}
				
			}
			
			return vocales;
		}
	
		//corresponde a ejercicio 20 de la colección 3
		public static boolean esAnioBisiesto (int anio) {
			
			boolean esBisiesto = false;
			
			if (anio > 1582 & anio%4==0 & anio%100!=0) {
				esBisiesto = true;
			}
			else if(anio > 1582 & anio%400==0) {
				esBisiesto = true;
			}
			
			
			return esBisiesto;
		}
		

		//corresponde a ejercicio 21 de la colección 3
		public static double calculadoraBasica(double num1, double num2, char letra ) {
			
			double solucion = 0;
			if (letra == '+' || letra == '-' || letra == '*'|| letra == '%' ) {
				switch (letra) {
					case '+':
						solucion = num1 + num2;
						break;
					case '-':
						solucion = num1 - num2;
						break;
					case '*':
						solucion = num1 * num2;
						break;
					case '%':
						solucion = num1 % num2;
						break;
				}
			}else {
				System.out.println("Signo no reconocido");
			}
			

			return solucion;
		}


		//corresponde a ejercicio 22 de la colección 3
		public static String calcularSiglo(int anio) {
			//para el siglo hacer el modulo del año 
			String antesDespuesCristo = "";
			String anioToSiglo = "";
			if (anio < 0) {

				antesDespuesCristo = "AC";
				if (anio % 100 == 0) {
					anio = anio / 100;
				} else {
					anio = (anio / 100) + 1;
				}

			} else if(anio == 0){

				anio = 1;
				antesDespuesCristo = "DC";

			}else {

				antesDespuesCristo = "AC";
				if (anio % 100 == 0) {
					anio = anio / 100;
				} else {
					anio = (anio / 100) + 1;
				}
				
			}

			anioToSiglo = Integer.toString(anio);


			return anioToSiglo + antesDespuesCristo;
		}

		//corresponde a ejercicio 23 de la colección 3
		public static void resolverEcuacionGradoDos(double num1, double num2, double num3) {
			double resultado1 = 0;
			double resultado2 = 0;

			if (((Math.pow(num2, 2))-4*num1*num3)>=0){
				resultado1 = (-num2+(Math.sqrt((Math.pow(num2, 2))-4*num1*num3))) / (2*num1);
				resultado2 = (-num2-(Math.sqrt((Math.pow(num2, 2))-4*num1*num3))) / (2*num1);
			}else{
				System.out.println("Números no válidos");
			}
			System.out.println("El resultado de la ecuación de segundo grado es " + resultado1 + " y " + resultado2 );
		
		}

		//corresponde a ejercicio 24 de la colección 3
		public static void obtenerDivisores(int num1) {
			
			for(int i= 1; i <= num1; i++){
				if(num1%i==0){
					System.out.println(i);
				}
			}
		}



}
	
	


