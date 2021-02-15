Proceso alumnosAprobadosNumeroNeg
	
	Definir nota Como Real;
	Definir numCont, totAprob Como Entero;
	
	numCont <- 0;
	totAprob <- 0;
	
	
	Repetir
		numCont <- numCont + 1;
		
		Escribir "Introduce nota";
		Leer nota;
		Si nota >= 5 Entonces
			totAprob <- totAprob + 1;
		FinSi
	Hasta Que nota<0
	
	Escribir "Calificaciones introducidas ", (numCont-1);
	Escribir "El total de alumnos aprobados es ", totAprob;
	Escribir "Porcentaje alumnos aprobados ", ((totAprob*100)/(numCont-1));
	
FinProceso
