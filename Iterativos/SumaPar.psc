Algoritmo  SumNumPares
	
	Definir num1, sum1 Como Real;
	num1 <- 0;
	sum1 <- 0;
	
	Mientras sum1%2 == 0 & num1<100 Hacer
		num1 <- num1 + 2;
		sum1 <- sum1 + num1;
	FinMientras
	
	Escribir num1;
	Escribir  sum1;
	
FinAlgoritmo
