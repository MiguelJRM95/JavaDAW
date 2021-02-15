Algoritmo MayorNum
	Definir num1, num2, num3 Como Entero;
	
	Escribir "Numero 1";
	Leer  num1;
	
	Escribir "Numero 2";
	Leer num2;
	
	Escribir "Numero 3";
	Leer num3;
	
	Si num1>num2 & num1>num3 Entonces
		
		Escribir "El numero mayor es ", num1;
		
	SiNo
		
		Si num2>num1 & num2>num3 Entonces
			
			Escribir "El numero mayor es ", num2;
			
		SiNo
			
			Escribir "El numero mayor es ", num3;
			
		FinSi
	
	FinSi
	
FinAlgoritmo
