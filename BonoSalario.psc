Proceso BonoSalario
	
	Definir salario Como Entero;
	Definir salarioFinal Como Real;
	
	Escribir "Introducir el salario base en euros";
	Leer  salario;
	
	Si salario <= 1000 Entonces

		salarioFinal <- (salario + (salario * 0.2));
		Escribir "El salario con el bono seria de ", salarioFinal, " euros";
		
	SiNo
		
		Si salario > 1000 & salario <= 1800 Entonces
			
			salarioFinal <- (salario + (salario * 0.15));
			Escribir "El salario con el bono seria de ", salarioFinal, " euros";
		SiNo
			
			salarioFinal <- (salario + (salario * 0.1));
			Escribir "El salario con el bono seria de ", salarioFinal, " euros";
			
		FinSi
		
	FinSi
	
FinProceso
