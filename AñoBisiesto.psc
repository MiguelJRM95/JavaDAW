Proceso AnioBisiesto
	
	Definir anioEntrada Como Entero;
	
	Escribir "Introduce el a�o a comprobar";
	Leer anioEntrada;
	
	Si anioEntrada < 1582 Entonces
		Escribir "El a�o ", anioEntrada, " no forma parte del calendario gregoriano";
	SiNo
		Si anioEntrada % 400 = 0 Entonces
			Escribir "El a�o ", anioEntrada, " es bisiesto";
		SiNo
			Si anioEntrada % 4 = 0  & anioEntrada % 100 <> 0 Entonces
				Escribir "El a�o ", anioEntrada, " es bisiesto";
			SiNo
				Escribir "El a�o ", anioEntrada, " no es bisiesto";
			FinSi
		FinSi
	FinSi
	
FinProceso
