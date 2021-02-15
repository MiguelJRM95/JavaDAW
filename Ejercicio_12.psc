Proceso Ejercicio12
	
	//Definición de variables
	Definir valorBillete Como Entero
	Definir valorLiteral Como Cadena

	Definir valorCorrecto Como Logico //variable que usaremos para validar la entrada
	
	//Entrada de datos
	Escribir 'Dime el valor del billete'
	Leer valorBillete
	
	
	//Proceso
	valorCorrecto <- Verdadero   //suponemos que el valor de entrada es correcto
	
	Segun valorBillete Hacer
		5:
			valorLiteral <- 'Cinco'
		10:
			valorLiteral <- 'Diez'
		20:
			valorLiteral <- 'Veinte'
		50:
			valorLiteral <- 'Cincuenta'
		100:
			valorLiteral <- 'Cien'
		200:
			valorLiteral <- 'Doscientos'
		500:	
			valorLiteral <- 'Quinientos'
		De Otro Modo:
			//el valor de entrada no es correcto, por lo que cambiamos el estado de valorCorrecto
			valorCorrecto <- Falso
	FinSegun
	
	Si valorCorrecto Entonces
		Escribir 'El billete es de ', valorLiteral, ' euros'
	SiNo
		Escribir 'El valor del billete no existe'
	FinSi
	
FinProceso
