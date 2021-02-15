Proceso AnioBisiesto
	
	Definir anioEntrada Como Entero;
	
	Escribir "Introduce el año a comprobar";
	Leer anioEntrada;
	
	Si anioEntrada < 1582 Entonces
		Escribir "El año ", anioEntrada, " no forma parte del calendario gregoriano";
	SiNo
		Si anioEntrada % 400 = 0 Entonces
			Escribir "El año ", anioEntrada, " es bisiesto";
		SiNo
			Si anioEntrada % 4 = 0  & anioEntrada % 100 <> 0 Entonces
				Escribir "El año ", anioEntrada, " es bisiesto";
			SiNo
				Escribir "El año ", anioEntrada, " no es bisiesto";
			FinSi
		FinSi
	FinSi
	
FinProceso
