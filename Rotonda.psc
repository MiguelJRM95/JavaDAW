Algoritmo Rotonda
	
	Definir radRotonda, perRotonda, areaRotonda Como Real; 
	
	//Entrada dato radio
	Escribir  "Introducir el radio de la rotonda";
	Leer radRotonda;
	
	//Calculo del perimetro
	perRotonda <- 2 * PI * radRotonda;
	
	//Calculo del area 
	areaRotonda <- PI * radRotonda ^ 2;
	
	
	//Salida
	Escribir "El perímetro de la rotonda es ", redon(perRotonda);
	Escribir "La superficie de la rotonda es ", redon(areaRotonda);
	
FinAlgoritmo

