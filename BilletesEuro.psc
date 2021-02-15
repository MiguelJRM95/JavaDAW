Algoritmo  CantidadABilletes
	
	Definir cantidadEuros Como Entero;
	
	Escribir "Introduce el importe del billete de Euro";
	Leer cantidadEuros;
	
	Si cantidadEuros = 5 Entonces
		
		Escribir "Tu billete es de cinco euros";
		
	SiNo
		
		Si cantidadEuros = 10 Entonces
			
			Escribir  "Tu billete es de 10 euros";
			
		SiNo
			
			Si cantidadEuros = 20 Entonces
				
				Escribir "Tu billete es de 20 euros";
				
			SiNo
				
				Si cantidadEuros = 50 Entonces
					
					Escribir "Tu billete es de 50 euros";
					
				SiNo
					
					Si cantidadEuros = 100 Entonces
						
						Escribir "Tu billete es de 100 euros";
						
					SiNo
						
						Si cantidadEuros = 200 Entonces
							
							Escribir "TU billete es de 200 euros";
							
						SiNo
							
							Si cantidadEuros = 500 Entonces
								
								Escribir  "Tu billete es de quinientos euros";
								
							SiNo
								
								Escribir "Ese billete no existe";
								
							FinSi
							
						FinSi
						
					FinSi
					
				FinSi
				
			FinSi
			
			
		FinSi
		
	FinSi
	
FinAlgoritmo

