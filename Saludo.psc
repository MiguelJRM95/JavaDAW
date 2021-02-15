Algoritmo  Saludo
	
	Definir nombre Como Caracter;
	Definir hora Como Entero;
	
	//Asignacion datos
	Escribir "Ingrese su nombre";
	Leer nombre;
	
	Escribir "Ingrese solamente la hora del dia";
	Leer hora;
	
	Si hora > 6 & hora < 12 Entonces
		
		Escribir "Buenos dias ", nombre;
	SiNo
		Si hora >= 12 & hora < 20 Entonces
			
			Escribir "Buenas tardes ", nombre;
		SiNo
			
			Escribir "Buenas noches ", nombre;
		FinSi
	FinSi
	
FinAlgoritmo