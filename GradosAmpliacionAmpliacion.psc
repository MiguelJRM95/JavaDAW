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
		
		Si formatoGrados = "F" Entonces
			
			gradosFarenheit <- cantidadGrados;
			gradosCelsius<- (gradosFarenheit - 32) * 5 / 9;
			Escribir gradosFarenheit, " grados Farenheit son ", gradosCelsius, " grados Celsius";
			
		SiNo
			
			Escribir "Unidad de temperatura incorrecta";
			
		FinSi
		
		
	FinSi
	
FinAlgoritmo

