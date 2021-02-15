Algoritmo  GradosAmpliacion
	
	Definir  formatoGrados Como Caracter;
	Definir  cantidadGrados Como Entero;
	Definir  gradosCelsius, gradosFarenheit Como Real;
	
	Escribir "Vas a introducir grados Celsius o Farenheit (C/F)";
	Leer  formatoGrados;
	
	Escribir "Introduce la cantidad de grados";
	Leer cantidadGrados;
	
	Si formatoGrados = "C" Entonces
		
		gradosCelsius <- cantidadGrados;
		gradosFarenheit<- 32 + 9 * gradosCelsius / 5;
		Escribir gradosCelsius, " grados Celsius son ", gradosFarenheit, " grados Farenheit";
		
	SiNo
		
		gradosFarenheit <- cantidadGrados;
		gradosCelsius<- (gradosFarenheit - 32) * 5 / 9;
		Escribir gradosFarenheit, " grados Farenheit son ", gradosCelsius, " grados Celsius";
		
	FinSi
	
FinAlgoritmo
