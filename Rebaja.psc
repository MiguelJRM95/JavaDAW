Algoritmo Rebaja
	
	Definir precInicial, porcRebaja Como Entero;
	Definir PrecFin Como Real;
	
	//Entrada datos
	Escribir "Introducir el valor del producto";
	Leer precInicial;
	
	Escribir "Introducir el porcentaje de rebaja";
	Leer  porcRebaja;
	
	//Asignacion de la rebaja
	PrecFin <- precInicial * (1 - porcRebaja/100);
	
	//Salida de datos
	Escribir "El precio final del producto es ", PrecFin;
	
FinAlgoritmo

