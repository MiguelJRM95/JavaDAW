Algoritmo  PrecioFinal
	
	Definir precSinIva, porcIva Como Entero;
	Definir precFin Como Real;
	
	//Entrada datos
	Escribir "Introducir precio del producto sin iva";
	Leer precSinIva;
	
	Escribir  "Introducir porcentaje de iva";
	Leer porcIva;
	
	//Calculo del precio
	precFin <- precSinIva * (1 + porcIva / 100);
	
	//Salida
	Escribir "El precio final del producto es ", precFin;
	
FinAlgoritmo

