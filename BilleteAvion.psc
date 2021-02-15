Algoritmo  PrecioBillete
	
	Definir km Como Entero;
	Definir  precioTot, precioKm Como Real;
	
	
	Escribir "Introduce la distancia en kilometros";
	Leer  km;
	
	
	precioKm <- 0.3*km;
	
	
	Si km < 1000 Entonces
		
		Escribir "El precio del billete son 300 euros";
	SiNo
		
		precioTot <- precioKm;
		Escribir "El precio del billete son", precioTot, " euros";
	FinSi
	
	
FinAlgoritmo