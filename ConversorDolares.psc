Algoritmo ConversorDolares
	
	//Variables
	Definir cantidadEuros, cantidadDolares Como Real;
	Definir tasaConversion Como Real;
	
	//Entrada de datos
	Escribir  "Cantidad de euros a cambiar";
	Leer cantidadEuros;
	
	//Conversion de divisa
	tasaConversion <- 1.20;
	cantidadDolares <- tasaConversion * cantidadEuros;
	
	//Salida
	Escribir  "Cantidad inroduccida ", cantidadEuros;
	Escribir "Cantidad en dolares USA ", cantidadDolares;
	
FinAlgoritmo
