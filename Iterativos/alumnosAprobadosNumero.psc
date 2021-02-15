Proceso alumnosAprobadosNumero
	
	Definir nota Como Real;
	Definir numCont, totAprob, totAlum Como Entero;
	
	Escribir "¿Cantos alumnos hay en clase?";
	Leer totAlum;
	
	numCont <- 0;
	totAprob <- 0;
	
	Mientras numCont < totAlum Hacer
		
		numCont <- numCont + 1;
		
		Escribir "Introduce nota";
		Leer nota;
		Si nota >= 5 Entonces
			totAprob <- totAprob + 1;
		FinSi
		
	FinMientras
	
	Escribir "El total de alumnos aprobados es ", totAprob;
	
FinProceso
